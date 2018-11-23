class Test{
	public static void main(String[] arg){
		Printer p1 = new HPPrinter();//向上转型:把子类对象赋值给父类的引用
		p1.open();
		p1.print();
		p1.close();

		Printer p2 = new CanonPrinter();
		p2.open();
		p2.print();
		p2.close();
	}
}