//today we are going to reverse an array without using the extra memory space 

public class ReverseArray {

	public static void reverseArray(int []arr)
	{
		int i=0;
		int j=arr.length-1;
		int temp;
		while(i<j)
		{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
			i++;
			j--;
		}
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		reverseArray(arr);
	}

}
