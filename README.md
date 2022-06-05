*******************************JAVA PROGRAM FOR ADDING TWO ARRAY**********************************************************************

public class Main
{
	public static void main(String[] args) {
		int a[][]={{1,2},{2,3}},i,j;
		for(i=0;i<2;i++)
		{
		   	System.out.println();
		    for(j=0;j<2;j++){
		    
		
		
		System.out.print(a[i][j]+" ");
		}
		}
	System.out.println();
	int b[][]={{9,5},{8,3}};
		for(i=0;i<2;i++)
		{
		   	System.out.println();
		    for(j=0;j<2;j++){
		    
		
		
		System.out.print(b[i][j]+" ");
		}
		}
		System.out.println();
	
	int c[][]= new int[50][50];
		for(i=0;i<2;i++)
		{
		    System.out.println();
		    for(j=0;j<2;j++){
		    
		c[i][j]=a[i][j]+b[i][j];
		
		System.out.print(c[i][j]+" ");
	
	
}
}
}
}
**************************************REVERSE AND PRINT EVEN INDEXED VALUE*********************************************************************

#include <stdio.h>

int main()
{
    int a[]={2,98,65,78,43,76},i,j,tem;
    for(i=0,j=5;i<=2,j>=3;i++,j--)
    { 
    tem=a[i];
    a[i]=a[j];
    a[j]=tem;
}
for(i=0;i<=5;i++)
{
printf("%d ", a[i]);

}
printf("\n");
for(i=0;i<=5;i++)
{
if(i%2==0)
printf("%d\n",a[i]);

}
}























