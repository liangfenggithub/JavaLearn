class Test{
	public static void main(String[] arg){
		Student zs = new Student("张三",12,5);
		//会默认同时执行person和student的构造函数，原因是为简化重复代码，子类必须执行父类的构造方法
		zs.info();


	}

}