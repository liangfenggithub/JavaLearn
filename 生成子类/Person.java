class Person{
	int age;
	String name;
	//无参函数
	Person(){
		System.out.println("这是person的无参构造函数");
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("这是person的有参构造函数,");
	}
	void eat(){
		System.out.println("吃饭");
	}
}