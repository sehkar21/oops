package Interface;

public class HSBCbank implements Usbank,Brazilbank { //we are achieving multiple inheritance
// IS-a relationship ----interface in class uses  ---implements keywords
	
	// if a class is implements any interface it is mandatory to define/override all the methods of that interface
	public void credit() {
	System.out.println("HSBC credit");
		
	}
	
	 public void debit() {
			System.out.println("HSBC debit"); 
		 
	 }
	 
	  public void tranfermoney() {
		
		  System.out.println("tranfermoney");
		 
	 }
	 public void mutualfund() {
		 System.out.println("mutualfund");
	 }
	 
	 
	  public void educationloan() {
		  System.out.println("educationloan");
	  }
	   
	  public void carloan() {
		  System.out.println("carloan");
	  }
	  
	  
}
