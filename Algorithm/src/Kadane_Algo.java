
public class Kadane_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {4,-3,-2,1,2,5,4,-3,7,8};
		int max_so_far=arr[0];
		int max_end_here=0;
		int start=0;
		int end=0;
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			max_end_here+=arr[i];
			if(max_so_far<max_end_here)
			{
				max_so_far=max_end_here;
				start=s;
				end=i;
			}
			if(max_end_here<0)
			{
				max_end_here=0;
				s=i+1;
			}
		}
		System.out.println(max_so_far+"  index is "+start+" "+end);
	}

}
