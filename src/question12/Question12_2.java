package question12;

public class Question12_2 {
	public static void main(String[] args) {
		int[] test = {88, 62, 54, 76, 45};
		int sum = 0;
		for (int i = 0; i < test.length; i++) {
			sum += test[i];
		}
			System.out.println("テストの合計点は" + sum + "点です");
	}
}
