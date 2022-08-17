#include<stdio.h>
main()
{
	int n = 1;
	int num1,num2,i,m; 
	scanf_s("%d/%d", &num1, &num2);
	int count[200];
	m = num1 / num2;
    i = num1 % num2;
	printf("%d.",m);
		while (i > 0)
	{
		
		i = i * 10;
		i = i % num2;
		count[n] = i;
		
		if (count[199] > 0) {
			break;
		}
		printf("%d", count[n]);
		n++;	
	} 
		printf("\n");
		


		

	return 0;
}