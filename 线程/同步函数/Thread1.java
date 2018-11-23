class Thread1 implements Runnable{
	private Service service;
	Thread1(Service service){
		this.service = service;
	}
	public void run(){
		this.service.fun1();
	}
}