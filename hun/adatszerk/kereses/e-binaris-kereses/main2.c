#include <stdio.h>

int binaris_kereses(int tomb[], int meret, int elem)
{
    int l = 0;
    int u = meret - 1;
    int i;

    while (l <= u)
    {
        i = (l + u) / 2;

        if (tomb[i] == elem) return 1;
        else if (tomb[i] < elem) l = i + 1;
        else /* if (tomb[i] > elem) */ u = i - 1;
    }

    return 0;   /* ekkor l > u */
}

int main()
{
    int tomb[] = {7,9,10,12,14,16};
    int meret = 6;  /* a tomb merete */
    int elem = 10;   /* keresett elem */

    int eredmeny = binaris_kereses(tomb, meret, elem);

    printf("%d benne van? %d\n", elem, eredmeny);

    return 0;
}
