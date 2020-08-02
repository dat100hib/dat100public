package no.hvl.dat100;

import static java.lang.Math.*;

public class Diagonal {

	public static void main (String[] args) {
		
		double kv = 3.0;
		double lv = 4.0;
		
		// double kv2 = kv * kv;
		// double lv2 = lv * lv;
		
		double kv2 = pow(kv,2);
		double lv2 = pow(lv,2);
		
		// double d2 = kv2 + lv2;
		double d2 = pow(kv,2) + pow(lv,2);
		
		// double d = sqrt(d2);
		
		double d = sqrt( pow(kv,2) + pow(lv,2) );

		
	}
}
