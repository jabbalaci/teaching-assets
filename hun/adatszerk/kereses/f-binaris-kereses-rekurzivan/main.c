#include <stdio.h>

int binaris_kereses(int tomb[], int lower, int upper, int elem)
{
    if (lower > upper) {
        return 0;   /* not found */
    }

    /* else */

    int i = (lower + upper) / 2;

    if (tomb[i] == elem) {
        return 1;
    }
    else if (tomb[i] < elem) {
        return binaris_kereses(tomb, i+1, upper, elem);
    }
    else {  /* if elem < tomb[i] */
        return binaris_kereses(tomb, lower, i-1, elem);
    }
}

int main()
{
    int tomb[] = {5,7,8,10,15,18,20,54,72,90};
    int meret = 10;  /* a tomb merete */
    int elem = 72;   /* keresett elem */

    int eredmeny = binaris_kereses(tomb, 0, meret-1, elem);

    printf("%d benne van? %d\n", elem, eredmeny);

    return 0;
}
