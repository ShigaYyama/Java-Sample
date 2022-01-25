package kadai6to2;

public class Computer {
	String name;

	String[] hand = { "グー", "チョキ", "パー" };
	
	public Computer() {
	}
	
	public int Action() {
		int ran = new java.util.Random().nextInt(3);
		return ran;
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