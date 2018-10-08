package question17;

public class Profile {

	private String name;
	private int age;

	public Profile() {
		name = "マイケル";
		age = 20;
	}

	public void show() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}
}
