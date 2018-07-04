//findMissing use the summation approach

//findMissing XOR will use the xor approach

import java.util.Scanner;
public class FindMissingNumberArray {

	public static int findMissing(int []arr,int n)
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int result=(n*(n+1))/2 - sum;
		return result;
		
		
	}
	
	public static int findMissingXor(int []arr,int n)
	{
		int xorArr;
		for(int i=0;i<arr.length;i++)
		{
			xorArr=xorArr^arr[i];
		}
		int xorN=0;
		for(int i=1;i<=n;i++)
		{
			xorN=xorN^i;
		}
		return xorArr^xorN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		int n=6;
		//System.out.println(findMissing(arr,n));
		int res=findMissingXor(arr,n);
		System.out.println(res);
				
	}

}
