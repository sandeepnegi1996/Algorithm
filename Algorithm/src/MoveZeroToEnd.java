import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveZeroToEnd {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int n=6;
		for(int i=0;i<n;i++)
		{
			list.add(scan.nextInt());
		}
		
		for(Integer a:list)
		{
			if(a==0)
			{
				
				int index=list.indexOf(a);
				System.out.println(index);
				list.remove(index);
				//list.add(0);
			}
		}
		
		for(int a:list)
			System.out.print(a+" ");
		

	}

}
