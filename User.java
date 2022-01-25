package kadai6to2;

public class User {
	String name;
	
	String[] hand = { "グー", "チョキ", "パー" };
	
	public User() {
	}
	
	public int Action() {
		@SuppressWarnings("resource") 
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}
	
	public String Hand(int handNum) {
		switch (handNum){
			case 0:
				return hand[0];
			case 1:
				return hand[1];
			case 2:
				return hand[2];
		}
		return name;
	}

}
