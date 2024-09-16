package no.hvl.dat100.filer.ekstra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JavaSerializationWrite {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Vare v1 = new Vare("bil", 10000.0);
		Vare v2 = new Vare("sykkel",1000.0);
		File file = new File("varedata.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
		objectOutputStream.writeObject(v1);
		objectOutputStream.writeObject(v2);
		objectOutputStream.close();
	}

}
