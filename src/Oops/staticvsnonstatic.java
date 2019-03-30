package Oops;

public class staticvsnonstatic {

	String name = "tom";								//non static global varible
	static int age =25;									//static global variable
	
	
	public static void main(String[] args) {
		//calling static methods and variables
		sum();											// method direct calling
		staticvsnonstatic.sum();						//method calling by classname
		
		System.out.println(age);						//variable direct calling
		System.out.println(staticvsnonstatic.age);		// variable calling by classname
		
		
		//calling non static methods and variables.. we have to create objects for non static methods and class
		
		staticvsnonstatic ob = new staticvsnonstatic();
		ob.send();
		System.out.println(ob.name);	
	
	}
	public void send() {
		System.out.println("send mail method");
	}
	public static void sum() {
		System.out.println("sum method");
	}

}
