class Test{
	public static void main(String [] args){
		//生成线程类的对象
		FirstThread ft = new FirstThread(); //java中生成一个继承Thread线程的对象就是启动一个线程
		//启动线程
		ft.start();//线程进入就绪态，等待抢占CPU运行 注意千万不要写ft.run(),这样写是无效的。

		//此时整个程序中有三个线程：主函数、自定义的线程、垃圾回收线程
		for(int i = 0; i<100; i++){
			System.out.println("main-->" + i);
		}

	}
}