package Oops;

public class Callbyvaluecallbyreference {

	int p;
	int q;

	public static void main(String[] args) {
	
		Callbyvaluecallbyreference obj = new Callbyvaluecallbyreference();
		int x=20;
		int y=30;
		obj.testsum(x,y);
		obj.p=20;
		obj.q=40;
		obj.swap(obj);
	System.out.println(obj.p);
	System.out.println(obj.q);
	}

	public int testsum(int a,int b) {
		 a=10;
		 b=20;
		int c=a+b;
		return c;
		
	}
	
	public void swap(Callbyvaluecallbyreference t) {
		int temp;
		temp =t.p;//temp=20
		t.p=t.q;//t.p=40
		t.q=temp;
		
	}
	
	
}
