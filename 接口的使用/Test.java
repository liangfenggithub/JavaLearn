class Test{
	public static void main(String[] args){
		Printer printer = null;//定义一个接口的引用

		int flag = 1;
		// if(flag == 0){

		// 	printer = new HPPrinter();//生成惠普打印机对象向上转型为打印机对象

		// }else{
		// 	printer = new CANONPrinter();//生成佳能打印机对象向上转型为打印机对象
		// }
		//如果再加几种打印机就得多写几次if else 这样的话重复代码太多，
		//如果我们一百个程序调用打印机，是不是得修改100次？如何减少重复代码呢？
		//我们可以定义一个函数，这个函数输入用户的选择 flag，然后返回对应的打印机对象,
		printer = PrinterFactory.getPrinter(2);
		printer.open();
		printer.print("hello world");
		printer.close();

		//增加了printerFactory后，如果需要新增打印机，那么Test类（调用类）不需要修改，只需要增加打印机类和修改factory就可以了
	}
}