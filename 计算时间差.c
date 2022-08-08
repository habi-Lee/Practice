#include<stdio.h>
int main05()
{
	int h1, m1;
	int h2, m2;
	scanf_s("%d %d", &h1, &m1);
	scanf_s("%d %d", &h2, &m2);
	int ih = h2- h1;
	int im = m2 - m1;
	if (im < 0) {
		im += 60;
		ih--;
	}
	printf("时间差为%d小时%d分", ih, im);

	return 0;
}