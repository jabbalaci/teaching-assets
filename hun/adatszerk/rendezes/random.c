#include <stdio.h>
#include <stdlib.h>    // rand(), srand()
#include <string.h>
#include <time.h>      // time()
#include <unistd.h>    // getpid()

void show(int tomb[], int meret)
{
    int i;

    for (i = 0; i < meret; ++i) {
        if (i > 0) {
            printf(" ");
        }
        printf("%d", tomb[i]);
    }
    printf("\n");
}

int main()
{
    int tomb[10];
    int meret = 10;
    int i;

   srand(42);
//    srand(time(NULL));
    // srand(time(NULL) + getpid());

    for (i = 0; i < meret; ++i) {
        tomb[i] = (int)(random() % meret + 1);
    }
    show(tomb, meret);

    return 0;
}
