class RunnableImpl implements Runnable{ //runnable接口的实现类
	public void run(){
		for(int i = 0; i< 100; i++){
			System.out.println("Runnable -->"+i);
		}
	}
}