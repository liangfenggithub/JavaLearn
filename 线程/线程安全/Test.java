class Test{
	public static void main(String[] args){
		MyThread myThread = new MyThread();
		//生成两个Thread对象，但是这两个对象共用同一个线程体。
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);

		//分别给线程命名
		t1.setName("线程 t1 -->");
		t2.setName("线程 t2 -->");

		//启动线程
		t1.start();
		t2.start();
	}

}