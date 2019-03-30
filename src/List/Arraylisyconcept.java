package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylisyconcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();//non generics
		 ar.add(10);
		 ar.add(20);
		 ar.add(30);
		 System.out.println(ar.size());
		 ar.add(30);
		 System.out.println(ar.size());//to get the size
		//dynamic array ---size is not fixed
		 //maintains insertion orders
		 //synchronized
		 //contains duplicate values
		 System.out.println(ar.get(2));//to print the values we use get method
		 
		 //to print all values
		 
		 for(int i=0;i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		
		//non generics vs generics  <1.5java there were no generics
		 
		ArrayList<Integer> ar1 = new ArrayList<Integer>();//generics
		ar1.add(1000);
		ar1.add(200);
		System.out.println(ar1.get(0));
		
		//ArrayList<E> ar2 = new ArrayList<E>();
		
		//employee class and objects
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
					
					
					
	}

}
