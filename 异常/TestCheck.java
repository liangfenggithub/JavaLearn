class TestCheck{
	public static void main(String[] arg){
		//check exception
		//如果是check exception的话，必须使用try catch捕捉异常，否则编译不能通过
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}