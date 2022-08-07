#include<stdio.h>
int main03()
{
	int n,m;
	printf("请输入支付金额：");
	scanf_s("%d",&n);
	printf("请输入商品金额：");
	scanf_s("%d", &m);
	if (n>m)
	{
		printf("应找%d", n - m);
	}
	else
	{
		printf("金额不足");
	}
	
	return 0;
}