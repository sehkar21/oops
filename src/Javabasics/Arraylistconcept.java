package Javabasics;

import java.util.ArrayList;

public class Arraylistconcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList(); //we have add method  in arraylist
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		ar.add("tom");
		ar.add("hello");
		ar.add(22.2);
		ar.add('m');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
	//	System.out.println(ar.get(9));
		
		
		//to print all the values of arraylist
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1212);
		System.out.println(ar1.get(0));
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("tom");
		System.out.println(ar2.get(0));
		System.out.println(ar.size());
		ar.remove(2);
		System.out.println(ar.size());
		
	}

}
