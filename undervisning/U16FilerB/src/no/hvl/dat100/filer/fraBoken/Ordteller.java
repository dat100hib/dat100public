package no.hvl.dat100.filer.fraBoken;

import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class Ordteller {

  public static void main(String[] args) throws Exception {
    String filnavn = "navn2.txt";

    Scanner leser = new Scanner( new File(filnavn) );
    int antOrd = 0;
    String ord;

    while ( leser.hasNext() ) {
      ord = leser.next();
      out.println(ord);
      antOrd++;
    }

    out.println("Antall ord: " + antOrd);

    leser.close();  // Lukk filen
  }

}
