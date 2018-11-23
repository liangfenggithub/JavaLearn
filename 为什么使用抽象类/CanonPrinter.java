class CanonPrinter extends Printer{//这是一个针式打印机
	//如果不是抽象类的话，那么如果忘记复写print方法，编译也不会报错，如果是抽象类，则会报错
	void print(){
		System.out.println("使用针式打印方法打印");
	}
}