class Test01{
	public static void main(String[] args){
		//生成一个A公司水管工对象
		//先生成一个水管工对象
		Plumber plumber = new Plumber();
		//再生成一个A公司的水管工
		AWorker awoker = new AWorker(plumber);
		awoker.doWork();
	
		Carpenter carpenter = new Carpenter();
		AWorker awoker2 = new AWorker(carpenter);
		awoker2.doWork();
	}
}