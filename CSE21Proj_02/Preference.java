public class Preference{
	
	int quietTime;
	int music;
	int reading;
	int chatting;

	public Preference (){
		quietTime = 0;
		music = 0;
		reading = 0;
		chatting = 0;
		
	}
	// a constructor: 4 input parameters
	public Preference (int quietTime, int music, int reading, int chatting){
			if (quietTime >= 0 && quietTime <= 10){
				this.quietTime = quietTime;
			}
			if (music >= 0 && music <=10){
				this.music = music;
			}
			if (reading >= 0 && reading <= 10){
				this.reading = reading;
			}
			if (chatting >= 0 && chatting <= 10){
				this.chatting = chatting;
			}	
	
	}
	//Accessor methods 
	public int getQuietTime (){
		return quietTime;
	}
	//Accessor methods 
	public int getMusic (){
		return music;
	}
	//Accessor methods 
	public int getReading (){
		return reading;
	}
	//Accessor methods 
	public int getChatting (){
		return chatting;
	}
	
	//Sum of absolute value of the differences in the 4 
	public int compare(Preference pref) {
		return (Math.abs(quietTime - pref.quietTime) + Math.abs(music - pref.music) + Math. abs(reading - pref.reading) + Math.abs(chatting - pref.chatting));
		
	}

	
}
