class Student extends Person{
	int grade;
	Student(String name, int age, int grade){
		super(name,age);//执行父类的构造函数
		this.grade = grade;
	}

	Student(){

	}
	//复写（override）：与父类的同名方法，\
	void info(){
		super.info();//调用父类的方法

		System.out.println("我上"+this.grade+"年级了。");
		// System.out.println("我的名字是："+this.name+"，我今年"+this.age+"岁了，"+"我上"+this.grade+"年级了。");
	}
	void echo(){
		System.out.println("echo");
	}
}