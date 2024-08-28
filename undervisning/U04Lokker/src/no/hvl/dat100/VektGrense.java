package no.hvl.dat100;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class VektGrense {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Startvekt:");
		int startVekt = parseInt(input.nextLine());

		System.out.print("Grense:");
		int grense = parseInt(input.nextLine());
		
		int totalVekt = startVekt;
		
		while (totalVekt < grense) {
			
			System.out.print("Registerer vekt:");
			int nesteVekt = parseInt(input.nextLine());
			
			totalVekt = totalVekt + nesteVekt;
			
			System.out.println(totalVekt);
		}
		
		System.out.println("Grense nådd: " + totalVekt);
		
		input.close();
	}

}
