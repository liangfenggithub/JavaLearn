class Student extends Person{
	int grade;
	void study(){
		System.out.println("教书");
	}
	Student(){
		System.out.println("我是student类的无参方法");
	}
	Student(String name, int age, int grade){
		super(name,age);//执行父类的构造函数
		this.grade = grade;
		System.out.println("我是student类的有参方法");
	}
	void info(){
		System.out.println("我的名字是："+this.name+"，我今年"+this.age+"岁了，"+"我上"+this.grade+"年级了。");
	}
}