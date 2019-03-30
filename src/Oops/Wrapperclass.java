package Oops;

public class Wrapperclass {

	public static void main(String[] args) {
	
		//data conversion from 
		//string to integer
		
			String x= "100";
			System.out.println(x+20);
			int i = Integer.parseInt(x);
			System.out.println(i+20);
			
			//string to double
			
			String y="12.33"; 
			double d =Double.parseDouble(y);
			System.out.println(d+12);
			
			//string to boolean
			String t="true";
		boolean b=	Boolean.parseBoolean(t);
			System.out.println(b);
			
			//int to String
			int h=100;
			String s =String.valueOf(h);
			System.out.println(s+12);
			
			String u="100A";
			Integer.parseInt(u);
			
			
	}

}
