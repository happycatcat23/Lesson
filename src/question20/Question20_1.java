package question20;

public class Question20_1 {
	public static void main(String[] args) {

		Test test = new Test();
		Test test2 = new Test();

		test2 = test;
		System.out.println("一つめのメモリーは" + test + "です");
		System.out.println("二つめのメモリーは" + test2 + "です");
	}
}