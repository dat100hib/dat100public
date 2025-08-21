import java.util.Scanner;

public class VektGrense {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Startvekt:");
		int startVekt = input.nextInt();

		System.out.print("Grense:");
		int grense = input.nextInt();
		
		int totalVekt = startVekt;
		
		while (totalVekt < grense) {
			
			System.out.print("Registerer vekt:");
			int nesteVekt = input.nextInt();
			
			totalVekt = totalVekt + nesteVekt;
			
			System.out.println(totalVekt);
		}
		
		System.out.println("Grense nådd: " + totalVekt);
		
		input.close();
	}
}
