
public class Stack_in_java {
	
	public final static int MAX=1000;
	int top=-1;
	int []arr=new int[MAX];
	
	public void push(int element)
	{
		if(top>MAX)
		{
			System.out.println("overflow");
			System.exit(1);
		}
		else {
			++top;
			arr[top]=element;
		}
	}
	public int pop()
	{
		if(top<0)
		{
			//nhi niklega underflow
			System.out.println("underflow");
			System.exit(1);
		}
		else {
			
			int x=arr[top];
			top--;
			
			return x;
		}
		return 0;
	}
	public boolean isEmpty()
	{
		boolean flag=false;
		if(top<0)
		{
			flag=true;
			return flag;
		}
		else {
			return flag;
		}
	}

	public static void main(String[] args) {
		
		Stack_in_java s1=new Stack_in_java();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		System.out.println(s1.pop());
		

	}

}
