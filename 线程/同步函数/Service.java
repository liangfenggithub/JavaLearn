class Service{
	public synchronized void fun1(){//同步函数

		try{
			Thread.sleep(3*1000);//休眠1000ms
			System.out.println("fun1");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	public synchronized void fun2(){//同步函数
		System.out.println("fun2");
		
	}
}