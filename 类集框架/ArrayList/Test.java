import java.util.List; //导入list接口
import java.util.ArrayList;//导入ArrayList，其中ArrayList是List接口的实现类

class Test{
	public static void main(String [] args){
		//与数组Array的区别是控件可扩展，对应数组Array声明大小后不可更改。
		//其中<String>是java中的泛型，代表ArrayList存储的String对象，且只能存储Sring对象，当然也可是自定的对象，比如Student
		ArrayList<String> arraylist = new ArrayList<String>();//jdk1.5会报一个警告，1.5以前没问题

		//对Arraylist添加数据
		arraylist.add("hello");
		arraylist.add("i am");
		arraylist.add("arraylist");
		arraylist.add("啦啦啦啦");
		arraylist.add("我是arraylist");

		//移除数据
		arraylist.remove(3);


		//输出arraylist 
		//
		for(int i = 0; i<arraylist.size();i++){
			System.out.println(arraylist.get(i));//获取用get方法
		}
	}
}