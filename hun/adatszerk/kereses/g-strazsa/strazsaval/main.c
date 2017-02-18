#include <stdio.h>

int benne_van(int tomb[], int meret, int elem)
{
    int i = 0;

    while (tomb[i] != elem) {
        ++i;
    }

    if (i < meret) return 1;
    else return 0;
}

int main()
{
    int meret = 8;
    int tomb[9] = {8,13,6,22,91,17,5,12};

    int keresett_elem = 5;
    tomb[8] = keresett_elem;

    printf("a %d benne van? %d\n", keresett_elem, benne_van(tomb, meret, keresett_elem));

    return 0;
}
