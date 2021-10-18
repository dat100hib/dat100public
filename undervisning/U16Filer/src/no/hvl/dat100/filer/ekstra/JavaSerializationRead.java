package no.hvl.dat100.filer.ekstra;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JavaSerializationRead {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("varedata.dat");
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
		while (true) {
				try {
					Vare current = (Vare) is.readObject();
					System.out.println("Vare med navn '" + current.getNavn() + "' og pris " + current.getPris());
			} catch (EOFException e) {
				break;
			} 
		}
		is.close();
		
	}

}
