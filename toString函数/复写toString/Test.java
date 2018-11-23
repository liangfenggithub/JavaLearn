class Test{
	public static void main(String[] args){
		User user = new User("alex",13);
		System.out.println(user);//默认调用的user对象是tostring方法，为了增加可读性，复写对象的toString方法
	}

} 