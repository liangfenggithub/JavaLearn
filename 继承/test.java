class Test{
	public static void main(String[] args){
		Student xm = new Student();
		xm.name="小明";
		xm.age = 15;
		xm.school = "龙凤坡小学";
		xm.info();
		xm.introduce();
		Teacher ls = new Teacher();
		ls.name = "李四";
		ls.age = 30;
		ls.address = "化稍营中学";
		ls.teach();
	}

}