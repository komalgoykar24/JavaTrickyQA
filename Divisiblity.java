import java.util.*;
class Divisiblity
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any no");
		int n=s1.nextInt();
		if(n % 5==0)
		{
			System.out.println("No is divisible by 5");
		}
		else
		{
			System.out.println("No is not divisible by 5");
		}
	}
}