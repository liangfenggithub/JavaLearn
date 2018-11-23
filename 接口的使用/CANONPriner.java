class CANONPrinter implements Printer{//实现printer
	private void clean(){
		System.out.println("CANONPrinter clean");
	}
	public void open(){
		System.out.println("CANONPrinter open");
	}
	public void close(){
		this.clean();
		System.out.println("CANONPrinter close");
	}
	public void print(String s){
		System.out.println("CANONPrinter print-->" + s);
	}

}