package javaBasicConcept;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Alif");
		ll.add("Test");
		ll.add("Selenium");
		ll.add("QTP");
		
		System.out.println("Content of linkedlist:" +ll);
		
		//add first value.
		ll.addFirst("Automation");
		System.out.println("Content of linkedlist:" +ll);
		ll.addLast("QA");
		System.out.println("Content of linkedlist:" +ll);
		ll.removeFirst();//remove first value
		System.out.println("Content of linkedlist:" +ll);
		ll.removeLast();//remove last value
		System.out.println("Content of linkedlist:" +ll);
		System.out.println(ll.get(3));
		
		ll.set(3, "Automation");//set value
         
		System.out.println("Content of linkedlist:" +ll);
		//for getting all the values.
		
		System.out.println("******************1");
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		//using advance for loop.
		System.out.println("******************2");
		for(String st:ll) {
			System.out.println(st);
		}
		
		//using iterator.
		System.out.println("******************3");
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******************4");
        //using while loop
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
