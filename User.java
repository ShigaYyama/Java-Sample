package kadai6to2;

public class User {
	String userHand;
	int num;

	public int Action() {

		while (true) {
			@SuppressWarnings("resource")
			int numStr = new java.util.Scanner(System.in).nextInt();

			if (numStr == 0 || numStr == 1 || numStr == 2) {
				num = numStr;
				break;
			} else {
				System.out.println("正しい値が入力されませんでした。入力を続けてください。");
				continue;
			}
		}

		return num;
	}

	public String Hand(int handNum) {
		String[] hand = { "グー", "チョキ", "パー" };
		switch (handNum) {
		case 0:
			userHand = hand[0];
			break;
		case 1:
			userHand = hand[1];
			break;
		case 2:
			userHand = hand[2];
			break;
		}
		return userHand;
	}

}
