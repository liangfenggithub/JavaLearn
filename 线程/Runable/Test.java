class Test{
	public static void main(String [] args){
		//生成一个Runnable接口 实现类 的对象
		RunnableImpl ri = new RunnableImpl();
		//生成一个Thread对象，并将上一步得到的对象作为参数传入
		Thread t = new Thread(ri);//生成Thread对象时将生成的Runable对象作为参数传递到构造函数中去
		//启动线程
		t.start();

	}
}