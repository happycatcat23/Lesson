package question12;

public class Question12_5 {
	public static void main(String[] args) {

		int[][] num = {{10, 20, 30}, {40, 50, 60}};

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.println((i + 1) + "段目の値は" + num[i][j] + "です");
			}
		}
	}
}
