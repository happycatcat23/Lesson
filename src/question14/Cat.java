package question14;

public class Cat {

	String name;
	int age;
	double height;
	double weight;
	String food;


	void show(){
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}
	void profile(){
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
	}
}
