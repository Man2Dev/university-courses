#include <iostream>
using namespace std;
int main()
{
	float numbers[10];
	float average, min=1000;
	int index=0;
	for(int i=0; i<10; i++)
	{
		cin >> numbers[i];
		average += numbers[i];
	}
	average = average/10;
	for(int i=0; i<10; i++)
	{
		if(numbers[i]-average>0)
		{
			if(numbers[i]-average<min)
			{
				min = numbers[i]-average;
				index = i;
			 }
	 	}
		 else
		 {
					if (-1*(numbers[i]-average)<min)
					{
					min = (numbers[i]-average)*-1;
					index = i;
					}
		  }
  	}
					cout << numbers[index];
	return 0;
}