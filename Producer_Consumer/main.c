#include "difinitions.h"

int main (int argc, char *argv[])
{
   pthread_t producer_th[2], consumer_th[2];
   pthread_attr_t attr;

   buffer_init();
   pthread_create(&producer_th[0], NULL, producer, 0);
   pthread_create(&consumer_th[0], NULL, consumer, 0);
  // pthread_create(&producer_th[1], NULL, producer, 1);
  // pthread_create(&consumer_th[1], NULL, consumer, 1);
   while(1){
	   Sleep(10000);
   }
   pthread_attr_destroy(&attr);
   buffer_destroy();
   pthread_exit(NULL);
}
