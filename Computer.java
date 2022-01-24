package kadai6to2;

public class Computer {
	String name;
	
//	じゃんけんの手を配列で作成
	String[] hand = { "グー", "チョキ", "パー" };
	String[] count = { "00", "01", "02" };
	
	public Computer() {
	}
	
//	最初のコメント
	public void StartComment() {
		System.out.println("じゃんけんを開始します。");
		System.out.println("あなたの手を選んでください。 ");

		for (int i = 0; i < count.length; i++) {

			System.out.println(count[i] + ":" + hand[i]);
		}
	}
	
//	勝敗用のメソッド　引数の数値を配列に当て込み手を表示する
	public void Draw(int user, int com) {
		System.out.println("あなた：" + hand[user] + " コンピューター：" + hand[com]);
		System.out.println("惜しい！あいこです！じゃんけんを続けます。");
	}

	public void Win(int user, int com) {
		System.out.println("あなた：" + hand[user] + " コンピューター：" + hand[com]);
		System.out.println("あなたの勝ちです！おめでとうございます！");
	}

	public void Lose(int user, int com) {
		System.out.println("あなた：" + hand[user] + " コンピューター：" + hand[com]);
		System.out.println("残念！あなたの負けです！じゃんけんを終了します。");
	}

}