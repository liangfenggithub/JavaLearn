class PrinterFactory{
	public static Printer getPrinter(int flag){//定义为静态方法

		Printer printer = null;//定义一个接口的引用
		if(flag == 0){
			printer = new HPPrinter();//生成惠普打印机对象向上转型为打印机对象
		}else if(flag == 1){
			printer = new CANONPrinter();//生成佳能打印机对象向上转型为打印机对象
		}else{
			printer = new XXXPrinter();//
		}
		return printer;
	}
}