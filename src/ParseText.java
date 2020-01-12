
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ParseText {

	public static void main(String[] args) throws IOException {
		
		/*
	 * 
	 * Scanner scanner = new Scanner(new File("file"));
	 * scanner.useDelimiter("\\D+");
	 * 
	 * 
	 * while (scanner.hasNextInt()) { System.out.println(scanner.nextInt()); } }
	 */
	
		BufferedReader in = new BufferedReader(new FileReader("file")) ;
		    String str =null;
		    while ((str = in.readLine()) != null) {
		    	String numberOnly= str.replaceAll("[^\\d.]", "");
		    	numberOnly.trim();
		        System.out.print(numberOnly);
		    }
		in.close();
		}
        
	}

