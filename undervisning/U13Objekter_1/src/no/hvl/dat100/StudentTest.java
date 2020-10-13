package no.hvl.dat100;

public class StudentTest {

	public static void main(String[] args) {
		// Opprette studenter
		Student s1 = new Student();
		s1.setStudentnr(2);
		s1.setFornavn("Ole");
		s1.setEtternavn("Olsen");
		s1.skrivUt();
		
		Student s2 = new Student(1, "Per", "Karlsen");
		s2.skrivUt();
		
		Student s3 = new Student("Kari", "Nilsen");
		s3.skrivUt();
		
		System.out.println(s1.getFornavn());
				
	}

}
