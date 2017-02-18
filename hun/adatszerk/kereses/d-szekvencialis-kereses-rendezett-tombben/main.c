#include <stdio.h>

int benne_van(int tomb[], int meret, int elem)
{
    int i;

    for (i = 0; i < meret; ++i)
    {
        if (tomb[i] == elem) {
            printf("# i erteke: %d\n", i);
            return 1;
        }
        else if (tomb[i] > elem) {
            printf("# i erteke: %d\n", i);
            return 0;
        }
    }

    printf("# i erteke: %d\n", i);
    return 0;
}

int main()
{
    int tomb[] = {2,3,3,5,7,8,9,10};
    int meret = 8;  /* a tomb merete */
    int elem = 3;   /* keresett elem */

    int eredmeny = benne_van(tomb, meret, elem);

    printf("%d benne van? %d\n", elem, eredmeny);

    /* ***************** */

    elem = 4;
    eredmeny = benne_van(tomb, meret, elem);
    printf("%d benne van? %d\n", elem, eredmeny);

    return 0;
}
