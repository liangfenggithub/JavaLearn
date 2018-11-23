class User{
	
	String name;
	int age;

	public boolean equals(Object obj){
		if(this == obj){
			return true;//如果两者是同一块内存，那么说明肯定内容和类型完全相同。双等于号对引用类型来讲是判断两者是否为堆内存的统一地址		
		}

		if(obj instanceof User){
			//判断值是否相同
			User u = (User)obj;
			if(this.age == u.age && this.name.equals(u.name)){//这里的equals不是递归，因为调用方不同，这里是name，也就是String类的equals，String类的equals已被JDK复写
				return true; //内容相同，返回true;
			}else{
				return false;
			}

		}else{
			return false;//不是统一类，直接返回false
		}
	}
}