class MyThread implements Runnable{//自定义线程实现Runable接口
	int i = 100;
	public void run(){
		while(true){
			//如果不加同步代码块，这两个线程同时操作i会出现错误，
			// System.out.println(Thread.currentThread().getName() + i);
			// i--;
			// Thread.yield();//让出CPU，重新让各个线程开始抢占，用于模拟错误
			// if(i<0){
			// 	break;
			// }
			//
			
			//同步代码块使得线程独占代码块中的资源，也就是在运行这块代码块时不会被其他线程运行这块代码块，
			//核心思想：this代表调用次函数的对象，也是一个同步锁，当一个线程拿到锁后，在执行完毕此块代码前不会释放锁，
			//当发生调度时，其他线程检测到这块代码块的锁没有被别的线程释放，则不能执行此块代码块，直到本线程释放锁，也就是执行完毕此块代码块
			synchronized(this){
				System.out.println(Thread.currentThread().getName() + i);
				i--;
				// Thread.yield();//让出CPU，重新让各个线程开始抢占，也就是开启线程调度
				if(i<0){
					break;
				}
			}
			
		}
	}
}