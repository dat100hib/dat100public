package no.hvl.dat100.filer.fraBoken;

import java.net.*;
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class NettsideLeser {
	  
	  public static void main(String[] args) throws Exception {
	  
	    URL url = new URL(args[0]);
	    URLConnection connection = url.openConnection();
	    
	    InputStream inn = connection.getInputStream();
	    Scanner leser = new Scanner( new InputStreamReader(inn) );

	    while ( leser.hasNextLine() )
	      out.println( leser.nextLine() );

	    inn.close();
	  }
	  
	}