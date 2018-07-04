/*
We are removing the duplicates from the array without using the exttra space
Technique:- We will check if the adjacent elements are different we will store the elements 
			inside the same array

*/
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,2,3,3,3,4,4};
		int n=arr.length;
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[n-1];
		
		for(int i=0;i<=j;i++)
			System.out.println(arr[i]);
	}
}
