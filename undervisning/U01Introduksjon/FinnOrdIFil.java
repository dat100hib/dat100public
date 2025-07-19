/* FinnOrdIFil.java
*
* Programmet leser inn et filnavn og et søkeord
* fra brukeren, og skriver ut alle de linjene i
* filen som inneholder søkeordet, påført linjenr.
*/

import java.util.Scanner;
import java.io.*;

public class FinnOrdIFil {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        System.out.print("Filnavn:");
        String filnavn = input.nextLine();
        
        System.out.print("Søkeord:");
        String sokeord = input.nextLine();
        
		try {
			
			BufferedReader fil = new BufferedReader(new FileReader(filnavn));
			
			String linje = fil.readLine();
			
			int linjenr = 1;
			
			while (linje != null) {
				
				if (linje.contains(sokeord))
					System.out.println(linjenr + ":" + linje);
				
				linje = fil.readLine();
				linjenr = linjenr + 1;
			}
			
			fil.close();
			
		} catch (Exception e) {
			System.out.println("Problem med å lese filen: " + filnavn);
		}
		
		input.close();
	}
}
