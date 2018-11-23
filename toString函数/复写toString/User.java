class User{
	String name;
	int age;
	public User(String name,int age){
		this.age = age;
		this.name = name;
	}
	//复写toString方法，使得对象的输出具有可读性。
	public String toString(){
		String result ="age:"+ age+ ", name: "+ name;
		return result;
	}
}