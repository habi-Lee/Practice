//two function
#include <stdio.h>
void butler(void);
int main(void){
    printf("i will summon the butler function.\n");
    butler();
    printf("yes,bring me some tea and writeable dvds.\n");

    return 0;
}
void butler(void){
    printf("you rang,sir?\n");
}