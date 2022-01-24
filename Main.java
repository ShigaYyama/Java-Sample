package kadai6to2;

public class Main {

	public static void main(String[] args) throws InterruptedException {

//		Computerクラスのインスタンスを生成
		Computer com = new Computer();
		
//		開始コメントはコンストラクタ内で処理
		com.StartComment();

		while (true) {
			@SuppressWarnings("resource")
			int num = new java.util.Scanner(System.in).nextInt();
			int ran = new java.util.Random().nextInt(3);

			System.out.println("最初はグー、じゃんけん");
			System.out.println("ポン！");

//			ランダムの数字と入力した数字の差異で勝敗を判別
//			メソッドの引数で配列の数値を照合させる
			if (num == ran) {
				com.Draw(num, ran);
				continue;

			} else if (num - ran == -1 || num - ran == 2) {
				com.Win(num, ran);
				break;

			} else if (num - ran == 1 || num - ran == -2) {
				com.Lose(num, ran);
				break;

			} else {
				System.out.println("正しい値が入力されませんでした。システムを終了します。");
				break;
			}

		}

	}

}
