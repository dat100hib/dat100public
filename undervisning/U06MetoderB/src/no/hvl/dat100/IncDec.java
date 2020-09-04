package no.hvl.dat100;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = -1;
		int b = 1;
		
		a++;
		System.out.println("a = " + a);
		
		b--;
		System.out.println("b = " + b);
					
		int x;
		
		x=a++;
		
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		
		int y;
		y=++a;
		
		System.out.println("y = " + y);
		System.out.println("a = " + a);

	}

}
