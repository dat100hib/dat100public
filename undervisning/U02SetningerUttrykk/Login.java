import java.util.Scanner;

public class Login {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.print("Brukernavn:");
		String brukernavn = in.nextLine();

		System.out.print("Passord:");
		String passord = in.nextLine();

		System.out.println(brukernavn + " " + passord);

		in.close();
	}
}
