package javaBasicConcept;

public class Constructor  {
	//global varials/instance variables
	String name;
	String address;
	int age;
	int phn;
	public Constructor(int age) {
		System.out.println("single");
		System.out.println(age);
		this.age=age;
		
	}
	
	public Constructor(int age, int phn) {
		System.out.println("double");
		System.out.println( age + " "+ phn);
		this.age=age; // class vars = local vars.
		this.phn=phn;
		
	}
	public Constructor(String name, String address, int age){
		this.name=name;
		this.address=address;
		this.age=age;
		
	}
	
	

	public static void main(String[] args) {
		
      Constructor con = new Constructor("Alef", "42 Sellers ave", 32);
      System.out.println(con.name);
      System.out.println(con.age);
      System.out.println(con.address);
      Constructor con1 = new Constructor(20);
      System.out.println(con1.age);
      Constructor con2 = new Constructor(40,30);
      System.out.println(con2.age + " "+con2.phn);
	}

}
