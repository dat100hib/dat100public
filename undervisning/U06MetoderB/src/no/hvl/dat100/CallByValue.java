package no.hvl.dat100;

public class CallByValue {

	public static void main(String[] args) {
		
		int tall = 9;
		
		System.out.println("main A: " + tall);
		
		parameterTest(tall);
		
		System.out.println("main B: " + tall);
	}
	
	private static void parameterTest(int x) {
		
		x = x + 1;
		
		int w = x;
		
		System.out.println(w);
		
	}
	
}
