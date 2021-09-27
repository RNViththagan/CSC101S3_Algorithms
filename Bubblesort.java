import java.util.Scanner;
public class Bubblesort
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Array size");
		int size = sc.nextInt();
		int array[]=new int[size]; 
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Enter number "+(i+1)+" :");
			array[i] = sc.nextInt();
		} 
		int sarray[]= Bubblesort(array);
		for(int i=0;i<sarray.length;i++)
		{
			System.out.print(sarray[i]+" ");
		} 		
	}
	public static int[] Bubblesort(int array[])
	{
		int loop=0;
		int temp=0;
		while(loop<array.length-1)
		{
			int i=0;
			while(i<array.length-1-loop)
			{
				if(array[i]>array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
				i++;
			}
			loop++;
		}
		return array;
	}
}