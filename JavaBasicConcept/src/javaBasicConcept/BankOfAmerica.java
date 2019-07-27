package javaBasicConcept;

public class BankOfAmerica implements USBank, FederalBank {
	
	 public void Debit() {
		 System.out.println(" usbank debit interface");
	 }
	 
	 public void Credit() {
		 System.out.println(" usbank credit interface");
	 }
	 
	 public void Transfer() {
		 System.out.println(" usbank transfer interface");
	 }
	 
	 public void Educationloan() {
		 System.out.println(" edu loan class");
	 }
	 
	 public void Businessloan() {
		 System.out.println(" business loan class");
	 }

	public void min_dept() {
		System.out.println("deposite amount");
	}

	
	public void Mutulafund() {
		System.out.println(" mutual method of federalbank ");
		
		
	}

}
