class User{
	private int age;
	public void setAge(int age) throws Exception{//声明异常由调用方进行捕捉处理
		if(age < 0){
			//1.生成异常对象
			// RuntimeException e = new RuntimeException("年龄不能为负数");
			//注意，如果生成的是Execption对象（checkException），那么编译就通不过，必须使用try catch语句，但是
			//如果在函数定义处紧跟throws exception声明的话，那么必须在函数的调用方使用trycatch处理。
			Exception e = new Exception("年龄不能为负数");
			//2.抛出异常
			throw e;
		}
		this.age = age;
	}
}