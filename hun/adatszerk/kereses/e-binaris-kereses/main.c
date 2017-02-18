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
    int tomb[] = {5,7,8,10,15,18,20,54,72,90};
    int meret = 10;  /* a tomb merete */
    int elem = 18;   /* keresett elem */

    int eredmeny = binaris_kereses(tomb, meret, elem);

    printf("%d benne van? %d\n", elem, eredmeny);

    /* ***************** */

    elem = 22;
    eredmeny = binaris_kereses(tomb, meret, elem);
    printf("%d benne van? %d\n", elem, eredmeny);

    return 0;
}
