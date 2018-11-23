abstract class Printer{
	void open(){
		System.out.println("open");
	}
	void close(){
		System.out.println("close");

	}
	abstract void print();//定义为抽象函数时，子类必须复写实现具体函数内容

	
}