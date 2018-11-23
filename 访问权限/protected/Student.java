package org.liangfeng;

import site.lfweb.Person;
public class Student extends Person{
	public Student(String name, int age){
		this.name = name;
		this.age = age;//子类可以调用父类的protected权限的变量
	}
	public void introduce(){
		System.out.println("我的名字是："+this.name+"我的年龄是："+this.age);
	}
}