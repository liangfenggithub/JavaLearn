class RunnableImpl implements Runnable{ //runnable接口的实现类
	public void run(){
		for(int i = 0; i< 100; i++){
			System.out.println("Runnable -->"+i);
			if(i== 50){
				try{
					Thread.sleep(2000);//线程休眠2000ms
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}
}