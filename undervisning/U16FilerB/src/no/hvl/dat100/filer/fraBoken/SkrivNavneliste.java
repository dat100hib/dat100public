package no.hvl.dat100.filer.fraBoken;

import java.io.*;
// Importerer aktuelle filklasser

public class SkrivNavneliste {

  public static void main(String[] args) throws Exception {
    // Åpner filen for skriving
    String filnavn = "navn.txt";
    PrintWriter skriver = new PrintWriter(filnavn);

    String[] navnTab = {"Jo","Jan","June","Jenny"};

    // Skriv hvert navn i navnTab til fil
    for (int i=0; i < navnTab.length; i++)
      skriver.println(navnTab[i]);

    skriver.close();      // Lukker filen
  }

}