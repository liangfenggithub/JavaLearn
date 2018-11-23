abstract class Person{
	String name;
	int age;
	Person(String name, int age){//抽象类的构造函数
		System.out.println("Person 抽象类的构造函数");
		this.name = name;
		this.age = age;
	}
	void introduce(){
		System.out.println("我的名字是" +this.name+"我的年龄是"+this.age);
	}
	abstract void eat();//抽象函数，一个类中只要有一个抽象函数，则该类必须是抽象类
}