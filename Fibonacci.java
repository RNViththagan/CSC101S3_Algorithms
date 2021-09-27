import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();
		int f1=1,f2=1,f3=0;
		int count=1;
		while(count<=i)
		{
			if(count==1)
			{
				System.out.print(f1);
				count++;
			}
			else if(count==2)
			{
				System.out.print(", ");
				System.out.print(f2);
				count++;
			}
			else
			{
				System.out.print(", ");
				f3=f1+f2;
				System.out.print(f3);
				f1=f2;
				f2=f3;
				count++;				
			}
		}
	}
}