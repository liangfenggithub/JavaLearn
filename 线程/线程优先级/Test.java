class Test{
	public static void main(String [] args){
		//生成一个Runnable接口 实现类 的对象
		RunnableImpl ri = new RunnableImpl();
		//生成一个Thread对象，并将上一步得到的对象作为参数传入
		Thread t = new Thread(ri);//生成Thread对象时将生成的Runable对象作为参数传递到构造函数中去
		System.out.println("新线程的优先级是："+t.getPriority());//打印线程的优先级
		t.setPriority(Thread.MAX_PRIORITY); //设置线程优先级为最大，线程越大，执行的概率就越大，注意不是一定先执行！
		System.out.println("修改后新线程的优先级是："+t.getPriority());//打印线程的优先级

		//启动线程
		t.start();

	}
}