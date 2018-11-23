class Test{
	public static void main(String [] args){
		Service service = new Service();
		//生成两个线程体 ,
		Thread1 thread1 = new Thread1(service);
		Thread2 thread2 = new Thread2(service);

		//生成两个线程
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);

		//启动线程
		t1.start();
		t2.start();

		//解析：
		//生成的thread1 和thread2 线程体通用一个对象，在线程体内部的两个同步代码块中共用一个对象service的锁，
		//因此只要一个线程只要进入代码块，也就是拿到锁后，另一个得等待第一个线程执行完毕释放锁后才可以执行。
		//
		//由此证明同步锁并不是锁住了代码块，而是拿到了对象的锁

	}
}