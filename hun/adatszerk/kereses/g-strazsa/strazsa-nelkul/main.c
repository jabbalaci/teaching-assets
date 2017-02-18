#include <stdio.h>

int benne_van(int tomb[], int meret, int elem)
{
    int i = 0;

    while (i < meret)
    {
        if (tomb[i] == elem) {
            return 1;
        }
        ++i;
    }

    return 0;
}

int main()
{
    int tomb[] = {8,13,6,22,91,17,5,12};
    int meret = 8;

    int keresett_elem = 7;

    printf("a %d benne van? %d\n", keresett_elem, benne_van(tomb, meret, keresett_elem));

    return 0;
}
