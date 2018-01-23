// Collatz Conjecture written in C
// Tested in gcc

#include <stdio.h>
#include <stdlib.h>

int main(){
    int num;
    printf("Enter a positive integer: ");
    scanf("%d", &num);

    while (num != 1){
        printf("%d ", num);

        if ((num % 2) == 0)
            num /= 2;
        else num = num * 3 + 1;
    } 
    printf("%d\n", num);
    return 0;
}

/* Demo:
    Enter a positive integer: 300
    300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1

    Enter a positive integer: 120
    120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
*/
