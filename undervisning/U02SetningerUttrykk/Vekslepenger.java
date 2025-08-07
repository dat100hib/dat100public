import java.util.Scanner;

public class Vekslepenger {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Pris:  ");
		int pris = in.nextInt();

		System.out.print("Betalt: ");
		int belop = in.nextInt();

		int diff = belop - pris;

		int tiere = diff / 10;
		int enere = diff % 10;

		System.out.println(tiere + " 10 kroner");
		System.out.println(enere + "  1 kroner");

		in.close();
	}
}