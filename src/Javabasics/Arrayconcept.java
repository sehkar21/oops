package Javabasics;

public class Arrayconcept {

	public static void main(String[] args) {
			
		// store similar datatypes in array
		//1. int array
		// lowest index is 0
		//highest index is n-1 ----n is array size
		// 1-d array
		// adv--- single variable can hold multiple variable
		//dis adv --- size is fixed ---to overcome this ---we use collections --also called dynamic array
		//stores only similar datatypes---to overcome this ----we use object array
		
     int i[]= new int[4];
     i[0]=10;
     i[1]=20;
     i[2]=30;
     i[3]=40;
     
     System.out.println(i[2]);
     System.out.println(i[3]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		
     System.out.println(i.length);
		
		// to print all the values of array
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		
		double d[]=new double[4];
		d[0]=10.12;
		d[1]=12.12;
		d[2]=13.23;
		d[3]=13.33;
		
		System.out.println("*********************");
		System.out.println(d[2]);
		
		char c[]=new char[3];
		c[0]='d';
		c[1]='f';
		c[2]='h';
		System.out.println("*********************");
		System.out.println(c[2]);
		
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println("*********************");
		System.out.println(b[1]);
		
		String s[] =new String[3];
		s[0]="sekar";
		s[1]="skek";
		s[2]="fdfs";
		System.out.println("*********************");
		System.out.println(s[1]);
		
		//object array 
		// object is a super class of all classes of java 
		Object ob[]= new Object[6];
		ob[0]="tom";
		ob[1]="25";
		ob[2]="12.33";
		ob[3]="1995";
		ob[4]="m";
		ob[5]="chennai";
		System.out.println("*********************");
		System.out.println(ob[2]);
		
		for(int k=0;k<ob.length;k++) {
			System.out.println(ob[k]);
		}
		
		
	}
	
	
	

}
