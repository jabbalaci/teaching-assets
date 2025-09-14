#include <stdio.h>

int paros(int n)
{
    if (n % 2 == 0) {
        return 1;
    }
    // else
    return 0;
}

void b() {
    puts("hello from b()");
}

void a() {
    b();
}

int main()
{
    int x = 6;

    if (paros(x)) {
        printf("páros\n");
    }
    else {
        printf("páratlan\n");
    }

    a();

    return 0;
}
