class Test{

	public static void main(String [] args){
		User u1 = new User();
		User u2 = new User();

		u1.name = "zs";
		u1.age = 18;

		u2.name = "zs";
		u2.age = 18;

		User u3 = u1;
		

		//使用双等号判断，双等号对于引用数据类型来讲是否为堆内存的同一块地址
		boolean b1 = u1 == u2; //u1和u2是两个对象，肯定在内存中地址不同，所以不相等
		boolean b2 = u1 == u3; 
		System.out.println("b1:"+b1);
		System.out.println("b2:"+b2);


		boolean b3 = u1.equals(u2);//此时调用的是equals继承自Object类的方法，内部只是单纯的双等于判断，不能满足我们的要求。
		//所以要进行复写。我们的要求是equals实现判断两者是否相同，而内部提供双等号只实现两者是否为统一地址，如果不是统一地址也有可能相同的情况，默认没考虑。
		//实际上u1和u2是相等的，所以我们要复写
		System.out.println("u1是否equeals u2： "+ b3);
	}
}