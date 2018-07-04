
public class bubble_sort {

	public static void bubblesort(int []arr)
	{
		int n=arr.length;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
					//swap
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hhelo");
		int []arr= {3,2,1,4,5};
		bubblesort(arr);
		for(int a:arr)
		{
			System.out.print(a+"  ");
		}
	}

}
