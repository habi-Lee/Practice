#include <stdio.h>
//这是一个将英寻转化为英尺的程序
//1英寻=6英寸
int main(void){
    int feet,fathoms;

    fathoms = 2;
    feet = fathoms * 6;
    printf("there are %d feet in %d fathoms!",feet,fathoms);
    printf("\nyes,i said %d feet!\n ",6*fathoms);
    
    return 0;
}