class XXXPrinter implements Printer{
	public void open(){
		System.out.println("XXXPrinter open");
	}
	public void close(){
		System.out.println("XXXPrinter close");
	}
	public void print(String s){
		System.out.println("XXXPrinter print-->" + s);
	}
}