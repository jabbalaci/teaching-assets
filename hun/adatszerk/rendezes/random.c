#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>

void show(int tomb[], int meret)
{
    int i;

    for (i = 0; i < meret; ++i) {
       printf("%d ", tomb[i]);
    }
    printf("\n");
}

int main()
{
    int tomb[10];
    int meret = 10;
    int i;

    /* srand(42); */
   srand(time(NULL) + getpid());
   /* srand(time(NULL)); */
    for (i=0; i<meret; ++i) {
        tomb[i] = (int)(random() % meret + 1);
    }
    show(tomb, meret);

    return 0;
}
