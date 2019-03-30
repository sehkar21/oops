package Methodoverriding;

public class Testcar {

	public static void main(String[] args) {
   // compile time and static polymorphism
     Bmw b = new Bmw();
     b.start();  //same method is present in parent and child class with same name 
     b.stop();   //and arg it will access the child class it is called method overriding
 	b.theftsafety();	
 	b.engine();
 	
 	System.out.println("*************");
 	Car c = new Car() ;
 	c.start();
 	c.stop();
 	System.out.println("&&&&&&&&&&&&");
 	
 	Car d = new Bmw();//child class object "new Bmw" can be referred by parent class refrence variable
 						// this is called run time polymorphism or dynamic polymorphism
 	d.start();
 	d.stop();
 	d.refuel();
 	d.engine();
 	
 }	

}
