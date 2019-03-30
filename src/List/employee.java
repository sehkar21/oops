package List;

import java.util.ArrayList;
import java.util.Iterator;

public class employee {

	String name;
	int age;
	String dept;
	employee(String name,int age,String dept){
		this.name = name;
		this.age =age;
		this.dept =dept;
	}
	
	
	public static void main(String[] args) {
		employee e1 = new employee("sekar",25,"QA");
		employee e2 = new employee("dada",24,"QA");
		employee e3 = new employee("asad",26,"QA");
		
		// create arraylist
		ArrayList<employee> ar3 =new ArrayList<employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		//iterator to traverse the values
	Iterator<employee> it =	ar3.iterator();
		while(it.hasNext()) {
			employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		System.out.println("******************************************************");
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("asda");
		ar.add("tom");
		ar.add("asdad");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		 ar2.add("fdfd");
		 ar2.add("fff");
		 //addall
		 ar.addAll(ar2);
		 
		 
		 
		 for(int i=0;i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
			System.out.println("******************************************************");
			//remove all
		 ar.removeAll(ar2);
		 for(int i=0;i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		 
		 //retain all
		 System.out.println("******************************************************");
		 ArrayList<String> ar4 = new ArrayList<String>();
			
			ar4.add("asda");
			ar4.add("tom");
			ar4.add("asdad");
		 
			ArrayList<String> ar5 = new ArrayList<String>();
			 ar5.add("asda");
			 ar5.add("fff");
		 
			 ar4.retainAll(ar5);
			 for(int i=0;i<ar4.size();i++) {
				 System.out.println(ar4.get(i));
			 }
		 
		 
	}
	
	
	
	
	
}
