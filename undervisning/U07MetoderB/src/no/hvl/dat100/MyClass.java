package no.hvl.dat100;

import java.util.Scanner;
import static java.lang.Integer.*;

public class MyClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Lengde:");
		
		int lengde = parseInt(input.nextLine());
		
		System.out.println("Areal:" + lengde*lengde);
		
		input.close();
		
	}

}
