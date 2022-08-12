#include<stdio.h>
main()
{
	int n,i,t;
	
	printf("请输入一个整数：\n");
	scanf_s("%d", &n);
	for (i = 2; i < n; i++) {
		if(n% i == 0)
		
		t = 0;
		break;
	}
	if (t==0)
	{
		printf("不是素数");
	}
	else
	{
		printf("是素数");
	}




	return 0;
}