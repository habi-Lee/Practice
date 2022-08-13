#include<stdio.h>
int main()
{
	int x;
	double sum = 0;
	int cnt = 0;
	scanf_s("%d", &x);
	 int number[200];
	while (x!=-1)
	{
		number[cnt] = x;
		sum += x;
		cnt++;
		scanf_s("%d", &x);
	}
	if (cnt>0)
	{
		int i;
		double average = sum / cnt;
		for (i = 0; i < cnt; i++)
		{
			if(number[i]>average)
			{
				printf("%d", number[i]);
			}
		}
	}

	return 0;
}