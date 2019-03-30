package Javabasics;

public class Finallyconcept {

	public static void main(String[] args) {


		test1();
		
	}

	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch(Exception e) {
			System.out.println("inside catch block");
		}
		//finally is block
		finally    // it is used with try catch ...executed after the try catch block
		{          // it will executed irrespective of exception in try catch block
			System.out.println("inside finally block");
		}
		
	}
	
	
	
}
