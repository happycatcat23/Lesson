package question11;

public class Question11_6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i + "回目の処理です");
		}
		System.out.println("処理を終了します");
	}
}