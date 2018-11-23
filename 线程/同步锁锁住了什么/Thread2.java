class Thread2 implements Runnable{
	private Service service;
	Thread2(Service service){
		this.service = service;
	} 
	public void run(){
		this.service.fun2();
	}
}