//here using recusrsion 
//its imp to send the low and high with the function call
import java.util.Scanner;
public class Binary_sear_Recursion {

	public static int binarySearch(int []arr,int low,int high,int element)
	{
		if(low<=high)
		{
			int mid=low+(high-low)/2;
			
			if(element==arr[mid])
					return 1;
			else if(element<arr[mid])
				return binarySearch(arr,low,mid-1,element);
			else 
				return binarySearch(arr,mid+1,high,element);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		int n=arr.length;
		int element=scan.nextInt();
		int result=binarySearch(arr,0,n-1,element);
		if(result==1)
		{
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

}
