//newton forward interpolation
#include<stdio.h>
#include<math.h>
int main()
{
float x[10],y[10],X,p=1,u,h,d;
int i,j,n;
printf("\t\t Output\n");
printf("\n Enter the no.of points:");
scanf("%d",&n);
printf("\n Enter the value of X at which y is reqd.");
scanf("%f",&X);
printf("\n Enter the values of x and y: \n\n");
printf("x\t\ty=f(x)\n");
for(i=1;i<=n;i++)
scanf("%f\t%f",&x[i],&y[i]);
h=x[2]-x[1];
printf("\n h=%f\n",h);
u=(X-x[1])/h;
d=y[1];
printf("u=%f,\td=%f",u,d);
for(i=1;i<=n-1;i++)
{
for(j=1;j<=n-1;j++)
{
y[j]=y[j+1]-y[j];
printf("\n%f\n",y[j]);
}
p=p*(u-i+1)/i;
d=d+p*y[1];
printf("\n%f",d);

}
printf("\n\nThe result of Newton Forward Interpolation\n\n");
printf("y(%f)=%f",X,d);
}





//OUTPUT:




/tmp/57SCx3IIgt.o
Output

 Enter the no.of points:5
 Enter the value of X at which y is reqd.2.1
 Enter the values of x and y: 

x		y=f(x)
2       16.56
2.2     21.78
2.4     32.56
2.6     41.97
2.8     52.68
h=0.200000
u=0.499999,	d=16.559999
5.220001

10.780001

9.410000

10.709999

19.169996
5.559999

-1.370001

1.299999

41.970001

18.474997
-6.930000

2.670000

40.670002

10.709999

18.041872
9.600000

38.000000

-29.960003

41.970001

17.666872

The result of Newton Forward Interpolation

y(2.100000)=17.666872
