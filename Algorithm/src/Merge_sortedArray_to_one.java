
public class Merge_sortedArray_to_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello world");
		
		int []a1= {2,3,60,70};
		int []a2= {50,65,80,90,100};
		
		//merge two sorted array into one
		int n=a1.length+a2.length;
		int []arr=new int[n];
		
		int i=0,j=0,k=0;
		while(i<a1.length && j<a2.length)
		{
			if(a1[i]<=a2[j])
			{
				arr[k]=a1[i];
				k++;
				i++;
			}
			else if(a1[i]>a2[j]) {
				arr[k]=a2[j];
				k++;
				j++;
			}
		}
		
		while(i<a1.length)
		{
			arr[k]=a1[i];
						k++;i++;
						
		}
		while(j<a2.length)
		{
			arr[k]=a2[j];
			k++;j++;
		}
		for(int t:arr)
		{
			System.out.print(t+"  ");
		}
	}

}
