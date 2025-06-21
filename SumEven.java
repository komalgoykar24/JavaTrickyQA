import java .util.*;
class EvenOdd
{
	public static void main(String args[])
	{
		int i;
		int sumeven=0;
		int sumodd=0;
		int counteven=0;
		int countodd=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("ENETR HOE MANY NOS DO YOU WANT TO ENTER");
		int n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("Eneter all elements:");
		for( i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				counteven++;
				sumeven+=a[i];
			}
			else
			{
				countodd--;
				sumodd+=a[i];
			}
		}

       System.out.println("Total even no. is:"+counteven);
       System.out.println("Total odd no. is:"+countodd);
       System.out.println("Sum of even no. is:"+sumeven);
       System.out.println("Sum of odd no. is:"+sumodd);
   }
}