#include "difinitions.h"
//-------------------------------
void *producer(void *tid){
	data d;
	d.cnt = 0;
	while(1){
		while (!buffer_push(&d, sizeof(data))){
			Sleep(1);
		}
		printf("Producer[%d] sent: %d\n", tid, d.cnt);
		d.cnt++;
		Sleep(500);
	}
	pthread_exit(NULL);
}
//-------------------------------
void *consumer(void *tid){
	data *d;
	while (1){
		d=buffer_pop();
		while (d == NULL){
			Sleep(1);
			d=buffer_pop();
		}
		printf("Consumer[%d] received: %d\n", tid, d->cnt);
		Sleep(700);
	}
	return NULL;
}
