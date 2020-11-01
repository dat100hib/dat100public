package no.hvl.dat100.gui.eiendomsregister.utsyn.tekst;

import java.util.Scanner;

public class Leser {

	private static Scanner leser = new Scanner (System.in);

	public static int lesInt(String tekst) {

		System.out.println(tekst);

		int tall = leser.nextInt();

		return tall;
	}

	public static String lesStreng(String tekst) {

		System.out.println(tekst);

		String s = leser.next();

		return s;
	}
}
