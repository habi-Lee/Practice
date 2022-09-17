#include <stdio.h>


	int BinarySearch( Tbl,  K)//在表Tbl中查找k
	{
	int left, right, mid, notfound = -1;


	left = 1;//初始值左边界
	right = Tbl->Length;//初始值右边界

	while (left<=right)
	{
		mid = (left + right) / 2;
		if (List[mid]<K)//中间值比查找值小
		{
			left = mid + 1;
		}
		else if (List[mid]>K)//中间值比查找值大
		{
			right = mid - 1;
		}
		else
		{
			return mid;//查找成功返回下标
		}

	}

	return notfound;//查找不成功返回-1
}