class Person{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	Person(){
		
	}
	void info(){
		System.out.println("我叫："+this.name+"我今年"+this.age+"岁了，");
	}
}