class Test{
	public static void main(String[] args){
		System.out.println(1);
		try{
			System.out.println(2);
			int i = 1/0;
			System.out.println(3);
		}
		catch(Exception e){//e是异常对象
			e.printStackTrace();//打印异常的堆栈信息
			System.out.println(4);
		}		
		finally{
			System.out.println("finally");
		}
		System.out.println(5);
		
	}
}