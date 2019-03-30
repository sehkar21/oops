package List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistconcept {

	public static void main(String[] args) {

			LinkedList<String> l = new LinkedList<String>();
			 l.add("tom");
			 l.add("adasd");
			 l.add("sssf");
			 l.add("ssfc");
			 l.add("dhfh");
			 l.add("gytyj");
			 System.out.println(l.get(1));
			l.addFirst("sekar"); //addirst
			l.addLast("QA");     //add last
			System.out.println(l);
			l.set(1,"skkll");   //set
			System.out.println(l.get(1));
		l.removeFirst();  //remove first
		l.removeLast();    //remove last
		System.out.println(l);
		
		l.remove(1); //remove particular index
		
		System.out.println(l);
		System.out.println("************for loop************************");
		//print all values for loop
for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i));
}
//foreach
System.out.println("******************foreach******************");
for(String x: l) {
	System.out.println(x);
}
System.out.println("**************iterator**********************");
		//iterator
  Iterator<String> ll=   l.iterator();
  
while(ll.hasNext()) {
	System.out.println(ll.next());
}
//while loop
System.out.println("*****************while loop*******************");
		int num=0;
		while(l.size()>num) {
			System.out.println(l.get(num));
			num++;
		}





	}

}
