public class EksemplerWhileB {

	public static void main(String[] args) {
	
		int x = 16;
		int y = 12;

		while (x != y) {
						
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
			
		}

		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}
}
