package kadai6to2;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Computer com = new Computer();
		User user = new User();
		
		startComment();
		
		while (true) {
			
			int num = user.Action();
			int ran = com.Action();
	
			System.out.println("あなた：" + user.Hand(num)+ " コンピューター：" + com.Hand(ran));
			
			battle(num,ran);
			if(num == ran) {
				continue;
			}
			break;
		}
	}
		
	public static void startComment() {
		System.out.println("じゃんけんを開始します。");
		System.out.println("あなたの手を選んでください。 ");
		System.out.println("0:グー");
		System.out.println("1:チョキ");
		System.out.println("2:パー");	
		System.out.println("最初はグー、じゃんけん");
		System.out.println("ポン！");
	}

	public static void battle(int userHand, int comHand) {
		
		if (userHand == 0 || userHand == 1 || userHand == 2) {
			if (userHand == comHand) {
				System.out.println("惜しい！あいこです！じゃんけんを続けます。");
				
			} else if (userHand - comHand == -1 || userHand - comHand == 2) {
				System.out.println("あなたの勝ちです！おめでとうございます！");
				
			} else if (userHand - comHand == 1 || userHand - comHand == -2) {
				System.out.println("残念！あなたの負けです！じゃんけんを終了します。");
			}
		} else {
			System.out.println("正しい値が入力されませんでした。システムを終了します。");
		}
	}

}
