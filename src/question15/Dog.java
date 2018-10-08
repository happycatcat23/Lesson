package question15;

public class Dog {

	String name ;
	int age ;
	String food;


	public void setName(String name) {
		this.name = name;
	}
	public void setProfile(int age,String food) {
		this.age = age;
		this.food = food;
	}
	void show() {
		System.out.println("名前は" + this.name + "です");
	}
	void Profile(){
	        System.out.println("年齢は" + this.age + "歳です");
	        System.out.println("好きな食べ物は" + this.food + "です");
	}
}
