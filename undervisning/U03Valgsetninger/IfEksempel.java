import java.util.Scanner;

public class IfEksempel {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("PPM: ");

	    int co2 = input.nextInt();
	  
	    if (co2 < 500) {
	    	System.out.println("GRØN");
	    } else {
	    	System.out.println("RØD");
	    }

		input.close();

	  }
}
