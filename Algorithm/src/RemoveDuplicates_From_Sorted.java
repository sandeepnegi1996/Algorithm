import java.util.*;

//here we will store the elemnets in the new array whenever 
//there is the difference in the array
import java.util.List;
public class RemoveDuplicates_From_Sorted {

	public static void removeDuplicates(int []arr)
	{
		List<Integer> al=new ArrayList<Integer>();
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				//kuch nhi krna
			}
			else {
				al.add((Integer)arr[i]);
				
			}
		}
		for(Integer num:al)
		{
			System.out.print(num+"  ");
		}
		
	}
	
	public static void MethodSecond(int []arr)
	{
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
		for(int k=0;k<=j;k++)
		{
			System.out.print(arr[k]+"  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,2,3,3,4,5,6,6,7};
		
		//removeDuplicates(arr);
		//for the method2 i am thinking like i should remove the constraint of the extra space
		//i have to think of the way by which i can store the element in the same array
		
		System.out.println();
		MethodSecond(arr);
	}

}
