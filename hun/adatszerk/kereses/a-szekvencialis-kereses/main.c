#include <stdio.h>

/*
Bővítés:

- a tömböt és a keresett elemet kérjük be a felh.-tól
- a tömböt és a keresett elemet olvassuk be fájlból

*/

int benne_van(int tomb[], int meret, int elem)
{
    int i;

    for (i = 0; i < meret; ++i)
    {
        if (tomb[i] == elem) {
            return 1;
        }
    }

    return 0;
}

int main()
{
    int tomb[] = {7,9,5,3,2,8,10,3};
    int meret = 8;  /* a tomb merete */
    int elem = 3;   /* keresett elem */

    int eredmeny = benne_van(tomb, meret, elem);

    printf("%d benne van? %d\n", elem, eredmeny);

    /* ***************** */

    elem = 15;
    eredmeny = benne_van(tomb, meret, elem);
    printf("%d benne van? %d\n", elem, eredmeny);

    return 0;
}
