class Test{
	public static void main(String[] args){
		A a = new A();
		//生成内部类的对象
		A.B b = a.new B();//或者 A.B b = new A().new B();
		//以上说明要实例化一个内部类的对象必须先有一个外部类的对象
		a.i = 3;
		b.j = 6;
		int result = b.funb();
		System.out.println(result);
	}
}