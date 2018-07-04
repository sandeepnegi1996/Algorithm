import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Covert_array_to_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr= {1,2,3,4};
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(arr));
		PriorityQueue<Integer> qu=new PriorityQueue<>();
		
		Collections.addAll(qu,arr);

		
		
		for(Integer a:list)
		{
			System.out.print(a+"  ");
		}
		System.out.println(Collections.max(list));
		
	}

}
