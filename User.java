package kadai6to2;

public class User {
	String name;

	public User() {
	}

//	public void Template() throws InterruptedException {
//		System.out.println("ポン！");
//		System.out.println("あなた：" + this.name + " コンピューター：チョキ");
//		Thread.sleep(2000);
//	}

	public void Win() throws InterruptedException {
//		Template();
		System.out.println("あなたの勝ちです！おめでとうございます！");
	}

	public void Draw() throws InterruptedException {
//		Template();
		System.out.println("惜しい！あいこです！じゃんけんを続けます。");
	}

	public void Lose() throws InterruptedException {
//		Template();
		System.out.println("残念！あなたの負けです！じゃんけんを終了します。");
	}
}
