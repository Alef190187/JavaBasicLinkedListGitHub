package javaBasicConcept;

public class Conversion {
    
	String name = "Naveen";// gobal variables non static
	static int age = 35;// static global var
	public static void main(String[] args) {
		
		String a = "200";
		System.out.println(a+100);//200100
		int b = Integer.parseInt(a);//wrapper class
		System.out.println(b+100);//300
		
		String d ="12.12";
		System.out.println(d+100);
		double c = Double.parseDouble(d);
		System.out.println(c+100);
		
		int e = 100;
		String f =String.valueOf(e);
		System.out.println(f+ "selenium");
		
		Conversion ob = new Conversion();//create object
		ob.test1("Alif");//call test1 method.
		ob.test();
		Conversion.test2("Alef", 32);
		Conversion.test2("Jihab", 10);
		System.out.println(Conversion.age);
		System.out.println(age);
        System.out.println(ob.name);
	}
	
	//duplicate method not allow in a method.
   //non static method
	public void test() {
		System.out.println("test1");
		
	}
	public void test1(String name) {
		System.out.println("test1");
		System.out.println(name);
			
	}
	//ststic method
	public static void test2(String name, int age) {
		System.out.println("test2");
		System.out.println(name + age);
	}

}
