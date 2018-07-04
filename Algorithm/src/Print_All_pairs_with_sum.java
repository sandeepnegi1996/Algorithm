import java.util.Arrays;
//
public class Print_All_pairs_with_sum {

	public static void printSubArray(int []arr,int sum)
	{
		int l=0;
		int r=arr.length-1;
	//just take care of one thing left can be incremented and right can be decremented only	
		while(l<r)
		{
			if(arr[l]+arr[r]<sum)
			{
				l++;
			}
			else if(arr[l]+arr[r]>sum)
			{
				r--;
			}
			else {
				//print the pairs
				System.out.println(arr[l]+"   "+arr[r]);
				l++;
				r--;
			}
		}
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,2,1,4,5,9,8,7,10,6};
		int sum=10;
		Arrays.sort(arr);  //thisi is step 1
		
		printSubArray(arr,sum);

	}

}
