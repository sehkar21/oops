package Interface;

public interface Usbank {

	int min_bal= 100;  //by default variables are static
						// variable values cannot be changed
						// no static methods are allowed
						// no main method
						// interfaces are abstract in nature we cannot create the object of interface
	
	public void credit();  //only method decl no method body
	
	public void debit(); // only method prototype
	
	public void tranfermoney();
	
	
	
	
}
