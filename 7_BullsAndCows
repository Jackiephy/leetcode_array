package Array;

public class BullsAndCows {
	public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] cnt = new int[10];
        for(int i = 0; i < secret.length(); i++) {
        	char s = secret.charAt(i);
        	char g = guess.charAt(i);
        	if(s == g) {
        		bulls++;
        	} else {
        		// s and g are char letters and need to be turned into numbers
        		if(cnt[s - '0'] < 0) cows++;
        		if(cnt[g - '0'] > 0) cows++;
        		cnt[s - '0']++;
        		cnt[g - '0']--;
        	}
        }
        return bulls + "A" + cows + "B";
    }
	
	public static void main(String[] args) {
		String secret = "1123";
		String guess = "0111";
		System.out.print(getHint(secret, guess));
	}
}
