
public class TwoStack_Array {

	int size;
	int top1;
	int top2;
	int arr[];
	public TwoStack_Array(int n) {
		arr=new int[n];
		size=n;
		top1=-1;
		top2=size;
		
	}
	
	public void push1(int element)
	{
		if(top1+1<top2)
		{
			top1++;
			arr[top1]=element;
		}
		else {
			System.out.println("stack Overflow");
			System.exit(1);
		}
	}
	
	public void push2(int element)
	{
		if(top1+1<top2)
		{
			top2--;
			arr[top2]=element;
		}
		else {
			System.out.println("stack Overflow");
		}
	}
	
	public int pop1()
	{
		if(top1>=0)
		{
			int x=arr[top1];
			top1--;
			return x;
		}
		else {
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2()
	{
		if(top2<size)
		{
			int x=arr[top2];
			top2++;
			return x;
		}
		else {
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}
	public static void main(String[] args) {
		TwoStack_Array t1=new TwoStack_Array(5);
		t1.push1(23);
		t1.push2(34);
		t1.push1(24);
		t1.push2(35);
		t1.push1(25);		
			
		System.out.println("Popping out from stack 1  "+t1.pop1());
		System.out.println("Poppin from stack 2  "+ t1.pop2());
	}

}
