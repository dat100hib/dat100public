import java.util.Scanner;

public class CO2Maaling {

	private static final int ANTALL = 3;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= ANTALL; i++) {

			System.out.print("PPM: ");

			int co2 = input.nextInt();

			if (co2 < 500) {
				System.out.println("GRØN");
			} else {
				System.out.println("RØD");
			}
		}

		input.close();
	}
}
