package no.hvl.dat100.eksempler;

public class TimePlan {

	static String[][] timeplan = {
			{"nor","eng","mat","nor","eng"},
			{"gym","ofa","fri","ofa","kun"},
			{"ofa","ofa","gym","mus","kun"},
			{"mat","nor","gym","mus","mat"}
	};
	
	static void skrivTimeplan() {
		
		System.out.println("       man tir ons tor fre");
		System.out.println("--------------------------");
		
	}
	
	public static void main (String[] args) {
		skrivTimeplan();
	}
}
