package Javabasics;

public class Loopsconcept {

	public static void main(String[] args) {
			//while loop
		
		
			int i=1;  //1.initialization
			while(i<=10) {  //2.condition
				System.out.println(i);
				//i++;
				i=i+1;//3.incremental
			}
		//System.out.println("condition fails");
		// disadv of while loop it will generate if there is no incremental or decremental part
			
		// 2. forloop
			System.out.println("***************");
			
			
		for(int j=1;j<=10;j++) { //initialiazation,condition,incremental
			System.out.println(j);
			
		}
		System.out.println("***************");
		
		for(int k=10;k>=-1;k--) { //initialiazation,condition,incremental
			System.out.println(k);
			
		}
		
		
	}

}
