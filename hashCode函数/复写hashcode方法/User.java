class User{
	String name;
	int age;
	public User(){

	}
	public User(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}

		if(obj instanceof User){
			User u = (User)obj;
			if(this.age == u.age &&this.name.equals(u.name)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	//复写hashcode
	//原则是；如果两个对象使用equals判断是相等的，那么hashcode的返回值必须相同
	public int hashCode(){
		int result = 17;//最好是质数
		//实现相同的对象返回相同的hashcode值
		result = 31 * result + age;
		result = 31 * result + name.hashCode();//name的hashcode已经被JDK复写，因此可以直接使用
		return result;
	}


}