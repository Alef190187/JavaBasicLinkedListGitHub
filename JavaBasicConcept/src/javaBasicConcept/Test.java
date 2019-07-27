package javaBasicConcept;

public class Test {

	public static void main(String[] args) {
	 
		Inheritange_Car car = new Inheritange_Car();
		car.Start();
		car.Refill();
		car.Run();
	
		
		BMW b = new BMW();
		b.Start();
		b.Run();
		b.Refill();
		//top casting 
		Inheritange_Car car1 = new BMW();
		car1.Refill();
		car1.Start();
		car1.Run();
		//down casting. down casting is not possible.
		//ClassCastException 
		BMW b1 = (BMW) new Inheritange_Car();
		b1.Refill();
		b1.Safety();
		

	}

}
