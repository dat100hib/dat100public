package no.hvl.dat100.iot;

public class Sensor {

	private static final int MINMAX = 20;

	public static double read() {
		
		long msecs = System.currentTimeMillis();

		double temp = 
					MINMAX * (Math.sin(msecs));

		return temp;
	}
}