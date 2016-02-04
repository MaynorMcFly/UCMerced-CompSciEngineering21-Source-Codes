public class Student {
	private String name; // name: of type String
	private char gender; // gender: of type char 
	private Date birthDay; //birthDay of type Date
	private Preference pref; // pref: of type Preference 
	private boolean matched; // matched of type Boolean
	private int month;
	private int day;
	private int year;
	public int compatabilityScore; 
	
	public Student (){ //default constructor
		name = "Annaliza";
		gender = 'F';
		matched = false;
		birthDay = new Date (month, day, year);
	}
	public Student(String name, char gender, Date birthDay, Preference pref) {
		this.name = name; // input parameter 1
		this.gender = gender; //input parameter 2
		this.birthDay = birthDay; //input parameter 3
		this.pref = pref; //input parameter4
		
		//a constructor, which sets the instance variables to their appropriate input parameters (4 inputs) 
	}
	// Mutator for the name
	public void setName(String name){
		this.name = name;
	}
	// Mutator for the gender
	public void setGender(char gender){
		this.gender = gender;
	}
	// Mutator for the gender
	public void setbirthDay(Date birthDay){
		this.birthDay = birthDay;
	}
	// Mutator for the preference
	public void setPreference(Preference pref){
		this.pref = pref;
	}
	
	public void setMatched(boolean matched){
	this.matched = matched;
	}
	
	//Accessor for the name
	public String getName() {
		return name;
	}
	//Accessor for the Gender	
	public char getGender(){
		return gender;
	}
	//Accessor for the Day
	public Date getbirthDay(){
		return birthDay;
	}
	//Accessor for the Preference
	public Preference getPref(){
		return pref;
	}
	
	public boolean getMatched(){
		return matched;
	}
	//compare(Student st) method that returns the compatibility score between oneself and the Student input parameter, st.
	public int compare(Student st){
		if(gender != st.gender){
		return 0; //Different genders make score 0 (only matching same gender students as roommates)
		}
		
		compatabilityScore = (40 - pref.compare(st.pref)) + (60-birthDay.compare(st.birthDay)); //Formula : (40 Ð Preferences) + (60 Ð AgeDifference)
		
		if (compatabilityScore < 0){
			return 0; //Highest score is 100 and lowest is 0
			}
			else if (compatabilityScore > 100){
			return 100; //Highest score is 100 and lowest is 0
			}
		
		return compatabilityScore; //Compatibility Score Calculation (returned by compare)
	}
	
}

