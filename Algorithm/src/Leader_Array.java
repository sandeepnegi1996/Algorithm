
public class Leader_Array {
	public static void printLeader(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					flag=true;
					break;
					
				}
			}
			if(flag==false)
			{
				System.out.print(arr[i]+" , ");
			}
		
			
		}
		System.out.println();
	}
	
	public static void optimiseLeader(int []arr)
	{
		int n=arr.length;
		
		int mfr=arr[n-1];
		System.out.print(mfr+"  ");
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>mfr)
			{				
				mfr=arr[i];
				System.out.print(mfr+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
		int []arr= {16,17,4,3,5,2};
		
		printLeader(arr); //this is done using bruteforce approach
		//now we will optimise our code
		//we will take the first element than 
		//we will find the biggest element in the remaining array
		//and then compare the first element to the biggesst if our element is bigger the the largest element than it is 
		//the leader
		
		int []arr1= {16,17,4,3,5,2};
		optimiseLeader(arr1);
		
		

	}

}
