
public class Test_Max_sumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,-1,2};
		int max=-1000;
		int lw=0;
		int hg=0;
		for(int k=0;k<arr.length;k++)
		{
			int sum=0;

		for(int i=k;i<arr.length;i++)
		{
			
				sum=sum+arr[i];	
				System.out.print(sum+"  ");
				
				if(sum>max) {
					max=sum;
					lw=k;
					hg=i;
				}

		}
		
			
		System.out.println();
	}
	System.out.println(max+" "+lw+"  "+hg);
	}

}
