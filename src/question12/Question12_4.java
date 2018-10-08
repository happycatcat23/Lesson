package question12;

public class Question12_4 {
	public static void main(String[] args) {

		int[] num = { 30, 53, 21, 70, 60 };

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}

		System.out.println("ソートが完了しました");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
