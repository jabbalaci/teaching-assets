#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 10_000_000
#define MAX 10000000

#define STOP -1

/*
    Hasznalata: futtassuk le parameterek nelkul es kiir egy
    help-et.
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

void beszurasos_rendezes(int tomb[], int meret)
{
    int i, j, temp, x;

    fprintf(stderr, "# beszurasos rendezes\n");

    for (i = 1; i < meret; ++i)
    {
        x = tomb[i];    /* aktuális elem */

        /* x beszúrása az x előtti rendezett sorozatba */
        j = i - 1;
        while ((j >= 0) && (tomb[j] > x))
        {
            tomb[j+1] = tomb[j];
            --j;
        }
        tomb[j+1] = x;
    }
}

void egyszeru_kivalasztasos_rendezes(int tomb[], int meret)
{
    int i, j, temp;

    fprintf(stderr, "# egyszeru kivalasztasos rendezes\n");

    for (i = 0; i < meret - 1; ++i)
    {
        for (j = i + 1; j < meret; ++j)
        {
            if (tomb[j] < tomb[i])
            {
                temp = tomb[i];
                tomb[i] = tomb[j];
                tomb[j] = temp;
            }
        }
    }
}

void minimumkivalasztasos_rendezes(int tomb[], int meret)
{
    int i, j, temp;
    int minindex;

    fprintf(stderr, "# minimumkivalasztasos rendezes\n");

    for (i = 0; i < meret - 1; ++i)
    {
        minindex = i;
        for (j = i + 1; j < meret; ++j)
        {
            if (tomb[j] < tomb[minindex]) {
                minindex = j;
            }
        }
        if (i != minindex)
        {
            temp = tomb[i];
            tomb[i] = tomb[minindex];
            tomb[minindex] = temp;
        }
    }
}

void buborek_rendezes(int tomb[], int meret)
{
    int i, j, temp;

    fprintf(stderr, "# (egyszeru) buborekrendezes\n");

    for (i = meret - 1; i >= 1; --i)
    {
        for (j = 0; j < i; ++j)
        {
            if (tomb[j] > tomb[j+1])
            {
                temp = tomb[j];
                tomb[j] = tomb[j+1];
                tomb[j+1] = temp;
            }
        }
    }
}

void javitott_buborek_rendezes(int tomb[], int meret)
{
    int volt_csere = 1;
    int i = meret - 1;
    int j;
    int temp;

    fprintf(stderr, "# javitott buborekrendezes\n");

    while (volt_csere && i >= 0)
    {
        volt_csere = 0;
        j = 0;
        while (j < i)
        {
            if (tomb[j] > tomb[j+1])
            {
                temp = tomb[j];
                tomb[j] = tomb[j+1];
                tomb[j+1] = temp;
                /* */
                volt_csere = 1;
            }
            ++j;
        }
        --i;
    }
}

/* with Shell's original gap sizes */
void shell_sort_shell(int a[], int n)
{
    int g, i, temp, j;
    int gap;

    fprintf(stderr, "# Shell rendezes (Shell eredeti lepeskozeivel)\n");

    for (gap = n / 2; gap >= 1; gap /= 2)
    {
        /* do an insertion sort for each gap size */
        i = gap;
        while (i < n)
        {
            temp = a[i];
            j = i;
            while ((j >= gap) && (a[j - gap] > temp))
            {
                a[j] = a[j - gap];
                j -= gap;
            }
            a[j] = temp;
            ++i;
        }
    }
}

/* with Ciura's gaps */
void shell_sort_ciura(int a[], int n)
{
    int gaps[] = {701, 301, 132, 57, 23, 10, 4, 1};
    int gap_size = sizeof(gaps) / sizeof(int);
    int g, gap, i, temp, j;

    fprintf(stderr, "# Shell rendezes (Ciura lepeskozeivel)\n");

    for (g = 0; g < gap_size; g++)
    {
        gap = gaps[g];

        /* do an insertion sort for each gap size */
        i = gap;
        while (i < n)
        {
            temp = a[i];
            j = i;
            while ((j >= gap) && (a[j - gap] > temp))
            {
                a[j] = a[j - gap];
                j -= gap;
            }
            a[j] = temp;
            ++i;
        }
    }
}

void quicksort(int a[], int bal, int jobb)
{
    int x, temp;
    int i, j;

    i = bal;
    j = jobb;
    x = a[(bal + jobb) / 2];
    while (i <= j)
    {
        while (a[i] < x) ++i;
        while (a[j] > x) --j;
        if (i <= j)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            /* */
            ++i;
            --j;
        }
    }

    if (bal < j)  quicksort(a, bal, j);
    if (i < jobb) quicksort(a, i, jobb);
}

/////////////////////////////////////////////////////////////////////////////

void rendez(int tomb[], int meret, char *alg)
{
    if (strcmp(alg, "-is") == 0)
    {
        beszurasos_rendezes(tomb, meret);
    }
    else if (strcmp(alg, "-ekr") == 0)
    {
        egyszeru_kivalasztasos_rendezes(tomb, meret);
    }
    else if (strcmp(alg, "-mkr") == 0)
    {
        minimumkivalasztasos_rendezes(tomb, meret);
    }
    else if (strcmp(alg, "-br") == 0)
    {
        buborek_rendezes(tomb, meret);
    }
    else if (strcmp(alg, "-jbr") == 0)
    {
        javitott_buborek_rendezes(tomb, meret);
    }
    else if (strcmp(alg, "-sr1") == 0)
    {
        shell_sort_shell(tomb, meret);
    }
    else if (strcmp(alg, "-sr2") == 0)
    {
        shell_sort_ciura(tomb, meret);
    }
    else if (strcmp(alg, "-qs") == 0)
    {
        fprintf(stderr, "# quicksort\n");
        quicksort(tomb, 0, meret-1);
    }
    else
    {
        fprintf(stderr, "Hiba: ismeretlen algoritmus.\n");
        exit(1);
    }
}

void feltolt_tomb(int tomb[], int meret, char *dtype)
{
    int i;

    if (strcmp(dtype, "-random") == 0)
    {
        for (i = 0; i < meret; ++i)
        {
            tomb[i] = (int)(random() % meret + 1);
        }
    }
    else if (strcmp(dtype, "-asc") == 0)
    {
        for (i = 0; i < meret; ++i)
        {
            tomb[i] = i+1;
        }
    }
    else if (strcmp(dtype, "-desc") == 0)
    {
        for (i = 0; i < meret; ++i)
        {
            tomb[i] = meret - i;
        }
    }
    else if (strcmp(dtype, "-const") == 0)
    {
        for (i = 0; i < meret; ++i)
        {
            tomb[i] = 1;
        }
    }
    else
    {
        fprintf(stderr, "Hiba: ismeretlen adathalmaz tipus.\n");
        exit(1);
    }
}

int main(int argc, char **argv)
{
	/* ezen a tombon fogunk dolgozni */
    int *tomb = (int *)malloc(MAX * sizeof(int));

	if (tomb == NULL)
	{
		fprintf(stderr, "Hiba: nem sikerult a tombot lefoglalni.\n");
		exit(1);
	}

    int meret = 0;  /* size of the array to be sorted */
    char *alg;      /* algorithm */
    char *dtype;    /* dataset type */

    if (argc != 4)
    {
        printf("Hiba: hianyzo parameterek.\n");
        printf("Hasznalat: %s <meret> <algoritmus> <adathalmaz_tipusa>\n", argv[0]);
        printf("meret:\n");
        printf("    [1,%d]\n", MAX);
        printf("algoritmus:\n");
        printf("    beszurasos rendezes (-is)\n");
        printf("    egyszeru kivalasztasos rendezes (-ekr)\n");
        printf("    minimumkivalasztasos rendezes (-mkr)\n");
        printf("    buborekrendezes (-br)\n");
        printf("    javitott buborekrendezes (-jbr)\n");
        printf("    shell rendezes #1 [Shell's gaps] (-sr1)\n");
        printf("    shell rendezes #2 [Ciura's gaps] (-sr2)\n");
        printf("    quicksort (gyorsrendezes) (-qs)\n");
        printf("adathalmaz tipusa:\n");
        printf("    -random (pl. [1,6,2,8,5,4,2,6,8,2])\n");
        printf("    -asc (pl. [1,2,3,4,5,6,7,8,9,10]\n");
        printf("    -desc (pl. [10,9,8,7,6,5,4,3,2,1]\n");
        printf("    -const (pl. [1,1,1,1,1,1,1,1,1,1]\n");
        exit(1);
    }

    /* else */

    meret = atoi(argv[1]);
    alg = argv[2];
    dtype = argv[3];

    if (!(meret >= 1 && meret <= MAX))
    {
        fprintf(stderr, "Hiba: a megadott meret nincs benne az [1,%d] intervallumban.\n", MAX);
        exit(1);
    }

    feltolt_tomb(tomb, meret, dtype);
//    show(tomb, meret);

    rendez(tomb, meret, alg);
    show(tomb, meret);

    return 0;
}
