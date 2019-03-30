package Finals;

public class Finaliseconcept {

	public static void main(String[] args) {
			
		
		Finaliseconcept f1 = new Finaliseconcept();
		Finaliseconcept f2 = new Finaliseconcept();
		

		f1= null;
		f2=null;   //if objects are not refering --garbage collection will destroy the unused objects
						// finalize used for clean up process before garbage collection
		System.gc();
		
		
		
	}
     public void finalize() {
    	 System.out.println("finalize ");
     }
}
