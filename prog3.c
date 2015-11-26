#include <stdio.h>
#include <conio.h>
main()
{
        int suma(int ,int );
        int roznica(int ,int );
        int iloczyn(int ,int );
        int iloraz(int ,int );
        int a,b,s;
        printf("\n Podaj a: \n a = ");
        scanf("%d",&a);
        printf(" Podaj b: \n b = ");
        scanf("%d",&b);
        s=suma(a,b);
        printf("\n Suma:    %d + %d = %d",a,b,s);
        s=roznica(a,b);
        printf("\n Roznica: %d - %d = %d",a,b,s);
        s=iloczyn(a,b);
        printf("\n Iloczyn: %d * %d = %d",a,b,s);
        s=iloraz(a,b);
        printf("\n Iloraz:  %d : %d = %d",a,b,s);
        getch();
        return 0;
}
int suma(int x,int y)
{
        int z;
        z=x+y;
        return z;
}
int roznica(int x,int y)
{
        int z;
        z=x-y;
        return z;
}
int iloczyn(int x,int y)
{
        int z;
        z=x*y;
        return z;
}
int iloraz(int x,int y)
{
        int z;
        z=x/y;
        return z;
}