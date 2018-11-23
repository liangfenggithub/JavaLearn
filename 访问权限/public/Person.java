package org.liangfeng;

//注意
//	1.在类前面如果加上public权限修饰符后必须保证文件名字和类名字统一，否则编译报错
//	2.如果包中的类不是public，则无法从外部对其进行访问 前提是不在同一个包中
public class Person{
	//3.如果包中的类里的变量没有声明为pubic，则其他包中无法对其进行访问
	public int age;
	public String name;
	public void introduce(){
		System.out.println("我的名字是："+this.name+",我今年"+this.age+"岁了");
	}
}