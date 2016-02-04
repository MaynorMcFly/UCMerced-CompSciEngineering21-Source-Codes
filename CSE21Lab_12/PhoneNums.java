package io;

import java.util.*;
import java.io.*;

public class PhoneNums {

	public static ArrayList<String> readPhoneNumbers() {
		String ccode;
		String acode;
		String pnum;
		
		String filename = "data/phone.txt"; 
		ArrayList<String> output = new ArrayList<String>();
		
		
		try {
			Scanner input = new Scanner ( new FileReader(filename) );

			while (input.hasNextLine()) {
				Scanner line = new Scanner(input.nextLine());
				line.useDelimiter("[+ -]"); 
				ccode = line.next();
				acode = line.next();
				pnum = line.nextLine();
				
				System.out.println("Country Code: " + ccode.replace("-", ""));
				System.out.println("Area Code: " + acode.replace("+", ""));
				System.out.println("Phone Number: " + pnum.replace("-", ""));
				
				
				if (line.hasNext())
					System.out.print(line.next());   
				
				//System.out.println(input.nextLine()); // Comment this line out 
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return output;
		
	}
	
	

}
