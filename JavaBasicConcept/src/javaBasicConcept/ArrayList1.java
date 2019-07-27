package javaBasicConcept;
 import java.util.ArrayList;
 import java.util.List;
 
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(200);
		ar.add("Money");
		ar.add(12.5);
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		ar.add("Hello");
		ar.add("World");
		ar.remove(4);
		System.out.println(ar.size());
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		
		

	}

}
