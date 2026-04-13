package 自分の教科書;

public class pg70 {
	public static void describeMood(int moodValue) {
		String mood;
		if(moodValue < 5) {
			mood = "sad";
		} else if (moodValue <= 10) {
			mood = "happy";
		} else {
			mood = "Ecstatic";
		}
		System.out.println("With a mood value of " + moodValue
				+ ", the character is feeling " + mood + ".");
	}
	
	public static void main(String[] args) {
		int moodValue = 3;
		System.out.println("In the morning:");
		describeMood(moodValue);
		
		moodValue = 7;
		System.out.println("Int the afternoon:");
		describeMood(moodValue);
		
		moodValue = 12;
		System.out.println("In the evening;");
		describeMood(moodValue);
	}
}
