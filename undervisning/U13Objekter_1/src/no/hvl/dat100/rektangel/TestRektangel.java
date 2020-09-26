package no.hvl.dat100.rektangel;

public class TestRektangel {

	public static void main(String[] args) {
//		Punkt p = new Punkt();
//		p.skrivUt();
//		p.x = 5;
//		p.y = 7;
		
		Punkt p = new Punkt(5, 7);
		p.skrivUt();
		
		Punkt q = new Punkt();
		q.setX(1);
		q.setY(2);
		q.skrivUt();
		
		System.out.println("x = " + q.getX());
		Rektangel r = new Rektangel(10, 20, 100, 100);
		r.skrivUt();
	}
}
