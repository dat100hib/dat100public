package no.hvl.dat100.kontrollflytt;

import java.io.*;

public class TestFinally {

	public static void main(String[] args) {

		catchMetode();
	}

	public static void catchMetode() {

		try {
			ExnMetode1();
			FileNotFoundException e = new FileNotFoundException("file not found");
			throw e;
		} catch (FileNotFoundException e) {
			System.out.println("fanget FileNotFoundException");
		} finally {
			System.out.println("Finally delen utføres selvom vi ikke fanger runtimeexception");
		}

		System.out.println("efter finally");
	}

	public static void ExnMetode1() {

		RuntimeException e = new RuntimeException("Exception");

		throw e;
	}

}
