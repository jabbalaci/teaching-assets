#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
    Ugyanazokat a "random" szamokat fogja generalni az
    
    srand(time(NULL));
    
    sor nelkul.
*/

void show(int tomb[], int meret)
{
    int i;

    for (i = 0; i < meret; ++i)
    {
       printf("%d ", tomb[i]);
    }
    printf("\n");
}

int main()
{
    int tomb[10];
    int meret = 10;
    int i;

//    srand(time(NULL));
    for (i=0; i<meret; ++i) {
        tomb[i] = (int)(random() % meret + 1);
    }
    show(tomb, meret);

    return 0;
}
