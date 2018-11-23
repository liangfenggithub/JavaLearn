import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


class Test{
	public static void main(String[] args){
		
		//1.定义set
		// HashSet<String> hashset = new HashSet<String>();
		// Set<String> set = hashset;//hashset向上转型set
		//也可以一步到位，如下
		Set<String> set = new HashSet<String>();

		//2.判断set是否为空
		boolean b = set.isEmpty();
		System.out.println("set是否为空？"+b);

		//3.添加数据
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");

		//4.再次判断set是否为空
		b = set.isEmpty();
		System.out.println("set是否为空？"+b);

		//5.获取set的大小
		int i = set.size();
		System.out.println("set 的大小是："+i);

		//6.添加重复的值，set会忽略，（因为set特点是无序不可重复）
		set.add("e");
		i = set.size();
		System.out.println("添加重复值后set的大小是："+i);

		//7.移除一个值
		set.remove("a");
		i = set.size();
		System.out.println("移除一个值set的大小是："+i);

		

		//8.取出所有数据 使用迭代器iterate
		//调用Set对象的iterator方法会生成的迭代器对象，该对象用于遍历整个Set
		Iterator<String> it = set.iterator();
		System.out.println("通过迭代器对象取数据：");
		// boolean b1 = it.hasNext();
		// if(b1){
		// 	String s = it.next();
		// 	System.out.println(s);//注意取出来的数据是乱序的，不一定是第几个
		// }
		String s = null;
		while(it.hasNext()){
			s = it.next();
			System.out.println(s);
		}


		//9.清空set
		set.clear();
		//10.再次判断set是否为空
		b = set.isEmpty();
		System.out.println("clear 以后set是否为空？"+b);



	}
}