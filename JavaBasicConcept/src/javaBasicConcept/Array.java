package javaBasicConcept;

public class Array {

	public static void main(String[] args) {
		
		int i[] = new int[3];//1 dimension array
		i[0] = 20;
		i[1] = 30;
		i[2] = 40;
		System.out.println(i[2]);
		System.out.println(i.length);
		//System.out.println(i[3]);
		
		for(int j = 0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("***********");
		Object [] ob = new Object [2];//object array
		ob[0] = "Alif";
		ob [1]= 32;
		for(int a=0; a<ob.length; a++) {
			System.out.println(ob[a]);
		}
		System.out.println("**********");
		int b[][]= new int[2][2];//2 dimension array.
		b[0][0]=20;
		b[0][1]=30;
		b[1][0]=40;
		b[1][1]=50;
		System.out.println(b[1][1]);
		int l = b[0].length;//colom number.
		System.out.println(l);
		System.out.println(b.length);//row number
		for(int row=0; row<b.length; row++ ) {
			for(int col=0; col<b[0].length; col++) {
				System.out.println(b[row][col]);
			}
		}
 }

}
