package javaBasicConcept;

public class TestInterface {

	public static void main(String[] args) {
		BankOfAmerica bank = new BankOfAmerica();//creating object.
		bank.Credit();
		bank.Debit();
		bank.Transfer();
		bank.Educationloan();
		bank.Businessloan();
		System.out.println(USBank.min_dept);// access variable by interface name.
       bank.Mutulafund();
	}

}
