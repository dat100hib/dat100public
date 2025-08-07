import java.util.Scanner;

public class Moms {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Beløp: ");

		double belop = in.nextDouble();

		double moms = belop * 0.25;
		double totalpris = belop + moms;

		String utTxt = "Beløp: " + belop + "\nMoms:   " + moms + "\nTotal: " + totalpris;

		System.out.println(utTxt);
	}
}
