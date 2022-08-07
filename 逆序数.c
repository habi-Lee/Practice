#include <stdio.h>
int main01()
{
	int n;
	printf("请输入三位数整数 ");
	scanf_s("%d", &n);

	int i = n / 100;//百位
	int j = n / 10 % 10;//十位
	int k = n % 10;//个位.
	printf("逆序数为%d\n", k * 100 + j * 10 + i);
	return 0;
}