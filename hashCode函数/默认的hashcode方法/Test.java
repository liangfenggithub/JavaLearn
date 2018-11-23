import java.util.*;

class Test{

	public static void main(String [] args){
		User u1 = new User();
		u1.name = "alex";
		u1.age = 18;

		//1.生成一个hashmap
		HashMap<User,String> map = new HashMap<User,String>();
		
		//2.增加键为user对象的数据
		map.put(u1,"abcdef");

		//3.以相同对象做键，取出hashcode，判断是否为传入的“abcdef”
		String s =map.get(new User("alex",18));//此时新传入的user对象和之前生成的u1对象用equals函数判断是相同的，
											   //那么按照规定，从hashmap中提出的值也应该是相等的，也就是s = “abcdef”
											   //但是实际上取出来的是 null
											   //原因是map的get方法是通过对象的hashcode方法得到的哈希值来判断user对象是否在map中存在
											   //Object默认的hashcode方法对不同的对象生成了不同的哈希值，所有类继承后也是如此，因此找不到为null	
											   //所以我们要复写对象的hashcode方法	
		System.out.println("取出的hashcode是："+s);
	}

}