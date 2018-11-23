//A公司的工人 
//装饰者模式，将一个对象传入，然后在执行对象的方法前添加需要的操作
class AWorker implements Worker{
	private Worker worker;
	public AWorker(Worker worker){
		this.worker = worker;
	}
	public void doWork(){
		System.out.println("你好，我是A公司的员工");
		this.worker.doWork();
	}
}