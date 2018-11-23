class Test{
	public static void main(String[] arg){
		Phone phone= new Phone();
		USB usb = phone;//向上转型，将子类的对象赋值给父类的引用
		usb.read();//转型后一个引用调用一个父类和子类的同名方法取决于所引用的对象，也就是此句调用的是usbPhone的read方法
		usb.write();//同上

		WiFi wifi = phone;//向上转型为WiFi
		wifi.open();
		wifi.close();

	}

}