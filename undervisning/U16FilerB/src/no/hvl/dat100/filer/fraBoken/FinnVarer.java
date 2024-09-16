package no.hvl.dat100.filer.fraBoken;

import java.io.*;
import java.util.Scanner;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class FinnVarer {

  public static void main(String[] args) throws Exception {
    String filnavn = showInputDialog("Filnavn:");
    String søk = showInputDialog("Varesøk:");
    finnVarer(filnavn, søk, ";");
  }

  public static void finnVarer(String filnavn,
                               String søk,
                               String skilletegn) throws Exception {
    Scanner leser = new Scanner( new File(filnavn) );
    String linje;

    if ( leser.hasNextLine() ) {
      linje = leser.nextLine();
    } // NB! Fjernet bare kolonneoverskriftene

    while ( leser.hasNextLine() ) {
      linje = leser.nextLine();
      behandleVarelinje(linje, søk, skilletegn);
    }
    leser.close();
  }

  public static void behandleVarelinje(String linje,
                                       String søk,
                                       String skilletegn) {
    String[] vareTab = linje.split(skilletegn);
    int nr = Integer.parseInt(vareTab[0]);
    String navn = vareTab[1];
    double pris = Double.parseDouble(vareTab[2]);
    int antall = Integer.parseInt(vareTab[3]);

    if ( navn.matches( "(.)*" + søk + "(.)*" ) )
      out.println("Vare " + nr + ": " +
                  navn + " - pris=" + pris +
                  " antall=" + antall);
  }

}

