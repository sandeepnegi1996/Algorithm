//we are finding the number which is odd times

import java.util.Scanner;
public class Number_Occur_Oddtimes {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int []arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int  x1=0;
	for(int i=0;i<arr.length;i++)
	{
		x1=x1^arr[i];
	}
	System.out.println(x1);
	}
}
