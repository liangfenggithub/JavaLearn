class Test{
	public static void main(String[] arg){


		Student s = new Student();
		Person p = s;
		p.name = "张三";
		p.age = 15;
		// p.grade = 3;//报错，因为grade是student的成员，所以p找不到，由此可见一个引用只能调用本类型的变量或方法就如类型为person的p只能调用name和age，调用不了student的grade
		
		p.echo();//同上 p只能调用引用类型person的变量和方法，而perosn没有echo，因此报错 
		// 以上说明 可见一个引用只能调用本类型的变量或方法
		p.info();//一个引用调用的是哪个方法，取决于这个引用指向的对象  此时p指向了suduent对象，因此调用的Student的info方法，也就是子类的方法
	}
}