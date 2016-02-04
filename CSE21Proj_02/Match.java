import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Match{
	
	public static void main(String[] args){
		//Create an array of Students (max = 100)
		Student [] arr = new Student [100];
		
		System.out.println("Please give the file name: ");
		Scanner input = new Scanner(System.in);
		String filename = input.next();
		try {
			Scanner fileInput = new Scanner (new FileReader(filename));
			int i = 0;
			
			while (fileInput.hasNextLine()){
				
				Scanner line = new Scanner(fileInput.nextLine());
				line.useDelimiter("[\t\r]"); //delimited
				String name = line.next(); //name(String)
				String gender = line.next(); //gender(char)
				String date = line.next(); //date (String)
				
				Scanner birthDateReader = new Scanner (date);
				birthDateReader.useDelimiter("-");
				int month = birthDateReader.nextInt();
				int day = birthDateReader.nextInt();
				int year = birthDateReader.nextInt();
				
				int quietTime = line.nextInt(); 
				int music = line.nextInt(); //int 0-10
				int reading = line.nextInt(); //int 0-10
				int chatting = line.nextInt(); //int 0-10
				
				Date birthdate = new Date (month, day, year);
				Preference pref = new Preference(quietTime, music, reading, chatting);
					Student studentAdd = new Student(name, gender.charAt(0), birthdate, pref);
					arr[i++] = studentAdd;
					
}
	
		int max = i;
		for (i = 0; i<max; i++){
			if (!arr[i].getMatched()){
				int bestScore = 0; int bestMatch = 0;
				for (int j=i+1; j<max;j++){
					if(!arr[j].getMatched()){
						int tmp = arr[i].compare(arr[j]);
						if (tmp > bestScore){
							bestScore = tmp;
							bestMatch = j;
							
							
						}
					}
				}
				if (bestScore != 0){
					arr[i].setMatched(true);
					arr[bestMatch].setMatched(true);
					System.out.println(arr[i].getName() + " matches with " + arr[bestMatch].getName() + " with the score " + bestScore);
				} else
					if (!arr[i].getMatched())
						System.out.println(arr[i].getName() + " has no matches.");
			}
		}
		input.close();
	} catch (NoSuchElementException e){
		System.out.println(e);
	} catch (FileNotFoundException e){
		System.out.println(e);
	}
}
}
