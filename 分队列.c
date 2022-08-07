#include <stdio.h>
int main02()
{
	int n,i;
	printf("请输入班级人数:");
	scanf_s("%d", &n);
	for (i = 1; i < n; i += 2) {
		printf("%d ", i);
	}

	return 0;
}