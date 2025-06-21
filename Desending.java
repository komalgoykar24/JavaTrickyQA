import java.util.*;
class Desending
{
	public static void main(String args[])
	{
		int temp,i;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=s1.nextInt();
        int a[] =new int[n];
        System.out.println("Enter all elements-->");
        for(i=0;i<n;i++)
        {
			a[i]=s1.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i] < a[j] )
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	  System.out.println("Asending order-->");
	  for(i=0;i<n;i++)
	  {
		  System.out.print(a[i]+",");
      }
}
}