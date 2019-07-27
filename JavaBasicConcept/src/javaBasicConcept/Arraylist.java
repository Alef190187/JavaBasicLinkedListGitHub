package javaBasicConcept;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
    
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Admin");
		ar.add("QA");
		ar.add("Automation");
		
    
		Hashtable<Object,Object> t = new Hashtable<Object,Object>();
		t.put(1, "alif");
		t.put("A", "Hello");
		System.out.println(t.size());
		
		
		Hashtable<Integer,Integer> t1 = new Hashtable<Integer,Integer>();
		t1.put(1, 2);
		t1.put(3, 4);
		System.out.println(t1.get(1));
		//how to achieve array from  user define class?
		//creating object of the employee class.
		Employee e = new Employee("Alif", "QA", 32);
		Employee e1 = new Employee("Bibek", "Automation", 43);
		Employee e2 = new Employee("Shahin", "Admin", 31);
		
		//creating arralist object and store values.
		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		ar1.add(e);
		ar1.add(e1);
		ar1.add(e2);
		System.out.println(ar1.size());
		
		//Retrieve value by using iterator.
		
		Iterator<Employee> it = ar1.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.dept);
			System.out.println(emp.age);
			System.out.println("************");
		}
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Alif");
		ar2.add("Shahin");
		ar2.add("Bibek");
		ar2.addAll(ar);
		for(int i=0; i<ar2.size(); i++) {
			System.out.println(ar2.get(i));
			
		}
		System.out.println("***************");
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Alif");
		ar3.add("Shahin");
		ar3.add("Bibek");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Alif");
		ar4.add("Shahin");
		ar4.add("Ripon");
		ar3.retainAll(ar4);//display common values
		
		for(int j=0; j<ar3.size(); j++) {
			System.out.println(ar3.get(j));
		}
		
		
	}
	

	
		
	

}
