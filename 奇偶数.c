#include<stdio.h>
int main()
{
	int n,i;
	int a = 0;
	int  b= 0;
	do

	{
		scanf_s("%d", &n);
		if (n > 0)
		{
			if (n % 2 == 0)
			{
				a++;
			}
			else
			{
				b++;
			
			}
		}
		else
		{
			break;
		}
	
	
	
	} while (n > 0);
	printf("偶数个数为%d，奇数个数为%d", a, b);
	return 0;
}