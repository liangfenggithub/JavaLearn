class Service{
	public void fun1(){
		synchronized(this){
			try{
				Thread.sleep(3*1000);//休眠1000ms
				System.out.println("fun1");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

	public void fun2(){
		synchronized(this){
			System.out.println("fun2");
		}
	}
}