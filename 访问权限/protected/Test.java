package org.test;

import org.liangfeng.Student;
class Test{
	public static void main(String[] arg){
		Student p = new Student("张三",15);
		p.introduce();
		p.age = 19;//非子类不能调用不同包下的protected修饰的变量
		p.name = "李四";

	}

}