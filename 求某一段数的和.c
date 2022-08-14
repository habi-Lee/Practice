#include<stdio.h>
int n, m;
void sum(int begin, int end)
{
	int i = begin;
	int sum = 0;
	for ( i = begin; i <= end; i++)
	{
		sum += i;
	}
	printf("从%d到%d的和是%d", n, m, sum);
}

int main()
{printf("请输入要求和的区间：");
scanf_s("%d %d", &n, &m);
	sum(n, m);


	return 0;
}