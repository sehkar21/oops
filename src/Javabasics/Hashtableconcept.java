package Javabasics;

import java.util.Hashtable;

public class Hashtableconcept {

	public static void main(String[] args) {

			Hashtable h = new Hashtable();
			
			h.put("A","Test");
			h.put("B", "Test");
			h.put("c","Test");
			System.out.println(h.size());
			
	h.put(1, 100);
	h.put(2, 200);
	System.out.println(h.size());
	System.out.println(h.get(2));
	System.out.println(h.get("c"));
		h.put(1,"tom");
		h.put(2,"sekar");
		System.out.println(h.get(2));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>(); //we have put method in hashtable 
		h1.put(100, 2020);
		//h1.put("sfs","sfa");
		System.out.println(h1.get(100));
		
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(100,"Sekarr");
		System.out.println(h2.get(100));
      
		
		System.out.println(h.size());
		h.remove(2);
		System.out.println(h.size());
	}

}
