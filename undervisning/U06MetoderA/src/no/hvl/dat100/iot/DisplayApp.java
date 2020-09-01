package no.hvl.dat100.iot;

public class DisplayApp {

	private static final int N = 1000;
	
	private static final int SLEEPTIME = 1000;
	
	public static void main(String[] args) {
		
		double current, min, max, sum;
		
		current = Sensor.read();
		
		min = current;
		max = current;
		sum = current;
		
		for (int i = 2; i<=N; i++) {
		
			current = Sensor.read();
			
			min = Math.min(min, current);
			
			max = Math.max(max, current);
			
			sum = current + sum;
			
			display(i,current,min,max,sum);
			
			delay();
		}

	}

	private static String twoDigits (double x) {
		return Double.toString(Math.round(x*100) / 100.0);
	}
	
	private static void display(int i, double current, double min, double max, double sum) {

		System.out.println(i + ":" + twoDigits(current) + "[" 
							 + twoDigits(min) +  " " + twoDigits(max) 
							 + "]" + twoDigits(sum/i));
	}

	private static void delay() {

		try {
			Thread.sleep(SLEEPTIME);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
