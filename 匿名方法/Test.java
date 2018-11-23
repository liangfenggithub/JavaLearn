class Test{
	public static void main(String [] args){
		// Aimpl aimpl = new Aimpl();
		// A a = aimpl;
		// B b = new B();
		// b.fun(a);
		// 
		// 以上是正常的调用，匿名内部类如下
		B b = new B();
		b.fun(new A(){//规定接口是不能生成对象的，在这里接口A紧跟大括号中的内容是对接口A的实现，new出来一个没有名字的对象
			public void doSomething(){
				System.out.println("匿名内部类");
			}
		});
	}
}