#include <stdio.h>

int find_min_index(int tomb[], int meret)
{
    int min_index = 0;
    int i;

    for (i = 1; i < meret; ++i)
    {
        if (tomb[i] < tomb[min_index]) {
            min_index = i;
        }
    }

    return min_index;
}

int main()
{
    int tomb[] = {7,9,5,3,2,8,10,3};
    int meret = 8;  /* tomb merete */

    int min_index = find_min_index(tomb, meret);
    printf("legkisebb elem indexe (elso elem indexe 0): %d\n", min_index);
    printf("legkisebb elem indexe (elso elem indexe 1): %d\n", min_index+1);

    return 0;
}
