#include <stdio.h>
#include <conio.h>
main()
{
        int a[10],i,n;
        int pom;
        do
        {
                printf("\n Podaj ilosc elementow tablicy a: \n n = ");
                scanf("%d",&n);
        }
        while(n<1||n>10);
        for(i=0;i<n;i++)
        {
                printf(" Podaj a[%d] = ",i);
                scanf("%d",&a[i]);
        }
        for(i=0;i<0.5*n;i++)
        {
                pom=a[i];
                a[i]=a[n-1-i];
                a[n-1-i]=pom;
        }
        printf("\n Odwrocona tablica a:");
        for(i=0;i<n;i++)
                printf("\n a[%d] = %d",i,a[i]);
        getch();
        return 0;
}
