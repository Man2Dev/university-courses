#include <pthread.h>
#include <stdio.h>
#include <string.h>
#include <windows.h>

typedef struct{
	unsigned int cnt;
}data;

void buffer_init();
void buffer_destroy();
BOOL buffer_push(data *d, unsigned int dsize);
data* buffer_pop();

void* producer(void*);

void* consumer(void*);
