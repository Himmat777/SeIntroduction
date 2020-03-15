package CoreJava;

import java.util.ArrayList;

//ARRAY LIST ,LINKED LIST,VECTOR IMPLEMENTS LIST INTERFACE AND ACCEPTS DUPLICATED VALUE
// ARRAY HAS FIEXED LENGHT ,ARRAY LIST IS DYNAMICALLY
public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			a.add(i);

			total = total + a.get(i);
			System.out.println("###################################################");
			System.out.println(a.get(i));

			// System.out.println(total + "This is inside of the loop");
		}

		System.out.println(a);
		System.out.println(total + "This is out side of the loop");

	}

}
