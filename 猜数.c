#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main()
{
	srand(time(0));
	int a = rand()%100;//生成随机数
	int num;
	int count = 0;
	printf("我已经想好一个100以内的数啦，快来猜猜\n");
	do {
		scanf_s("%d", &num);
		count++;
		if (num<a)
		{
			printf("比我想的小");
		}
		else
		{
			printf("比我想的大");
		}
	} while (num != a % 100);
		printf("你猜对了，用了%d次", count);

	return 0;
}
