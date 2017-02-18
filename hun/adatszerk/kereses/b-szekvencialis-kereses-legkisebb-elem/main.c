#include <stdio.h>

int find_min(int tomb[], int meret)
{
    int min = tomb[0];
    int i;

    for (i = 1; i < meret; ++i)
    {
        if (tomb[i] < min) {
            min = tomb[i];
        }
    }

    return min;
}

int main()
{
    int tomb[] = {7,9,5,3,2,8,10,3};
    int meret = 8;  /* tomb merete */

    int min = find_min(tomb, meret);
    printf("legkisebb elem: %d\n", min);

    return 0;
}
