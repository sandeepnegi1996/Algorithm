//print the fibonacci up to n the number that is given
import java.util.Scanner;
public class fibonacci {

	public static void fibo(int n)
	{
		int arr[]=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		fibo(n);
		
	}

}
