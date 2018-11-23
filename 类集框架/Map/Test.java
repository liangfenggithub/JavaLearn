import java.util.Map;
import java.util.HashMap;



class Test{
	public static void main(String[] args){
		//1.定义一个HashMap对象并向转型为Map引用
		HashMap<String,String> hashmap = new HashMap<String,String>();
		Map<String,String> map = hashmap;

		//2.增加Map键值对
		map.put("1","a");
		map.put("2","b");
		map.put("3","b");
		map.put("4","d");

		//3.获取map的大小
		int size = map.size();
		System.out.println("map的大小是："+size);


		//4.获取一个map的值
		String s = map.get("3");//注意get（）方法的参数是键值对的“键”，并不是下标
		System.out.println("map中，键 3 对应的值是"+s);

		//5.为已存在的键值对赋新值
		map.put("3","new value");
		System.out.println("map中，键 3 对应的新值是" + map.get("3"));



	}
}