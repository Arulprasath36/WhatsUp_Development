# javaprogram


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
	int b[][]={{9,5},{8,3}},k,l;
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
