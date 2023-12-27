#include "difinitions.h"

#define buffer_size 4

unsigned int front,rear;

data buffer[buffer_size];

pthread_mutex_t buffer_mutex=PTHREAD_MUTEX_INITIALIZER;

//----------------------------------
void buffer_init(){
	front=0;
	rear=0;
	pthread_mutex_init(&buffer_mutex, NULL);
}
//----------------------------------
void buffer_destroy(){
	pthread_mutex_destroy(&buffer_mutex);
}
//----------------------------------
BOOL buffer_push(data *d, unsigned int dsize){
	pthread_mutex_lock(&buffer_mutex);
	if ((rear+1)%buffer_size == front){//Buffer is full
		pthread_mutex_unlock(&buffer_mutex);
		return FALSE;
	}
	memcpy(&buffer[rear], d, dsize);
	rear=(rear+1)%buffer_size;
	pthread_mutex_unlock(&buffer_mutex);
	return TRUE;
}
//----------------------------------
data * buffer_pop(){
	data *d;
	pthread_mutex_lock(&buffer_mutex);
	if (front==rear){//Buffer is empty
		pthread_mutex_unlock(&buffer_mutex);
		return NULL;
	}
	d=&buffer[front];
	front=(front+1)%buffer_size;
	pthread_mutex_unlock(&buffer_mutex);
	return d;
}
//----------------------------------
