//This is the iterative version of the binary search

import java.util.Scanner;
public class Binary_using_Iteration {
	
	public static int binarySearch(int []arr,int element)
	{
		int len=arr.length;
		int low=0;   
		int high=len-1;
		int mid;
		while(low<=high)
		{
			mid=low + (high-low)/2;
			if(element==arr[mid])
				return 1;
			else if(element<arr[mid])
			{
				high=mid-1;
			}
			else if(element>arr[mid])
			{
				low=mid+1;
			}
		}
		return -1;
			
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int []arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Enter the element needs to be searched:-  ");
		int element=scan.nextInt();
		int result=binarySearch(arr,element);
		if(result==1)
		{
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		}
		scan.close();
	}

}
