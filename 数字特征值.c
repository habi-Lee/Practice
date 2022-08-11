#include<stdio.h>
int main()
{
	int n;//输入的数
	int m=1;//数位
	int i;//二进制
	int j=1;//2的等比数列
	int k;//最右边的数
	int sum=0;//输出的十进制
	scanf_s("%d", &n);
	for ( ;n!=0;m++)
	{
		k=n % 10;
		if ((k+m)%2==0)
		{
			int i = 1;//奇偶性相同
		}
		else
		{
			int i = 0;//奇偶性不同
		}
			sum = sum + i*j;
		j = 2 * j;
		n = n / 10;
	}
	printf("%d", sum);


	return 0;
}
