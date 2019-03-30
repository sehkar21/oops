package Interface;

public class TestBank {

	public static void main(String[] args) {
		HSBCbank hs =new HSBCbank(); 
		hs.carloan();
		hs.credit();
		hs.debit();
		hs.educationloan();
		hs.tranfermoney();
		hs.mutualfund();
		
		Usbank b = new HSBCbank();
			b.credit();
		b.credit();
		b.tranfermoney();
		
		
		System.out.println(Usbank.min_bal);
		
	}

}
