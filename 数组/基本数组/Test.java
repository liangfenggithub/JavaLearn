class Test{
	public static void main(String [] args){
		//1.数组的静态声明法 与c语言类似
		//arr是整形数组类型，属于引用类型。
		int arr[] = {1,3,4,5,6,76};
		arr[3] = 9;
		System.out.println(arr[3]);
		

		//打印数组长度
		System.out.println("arr数组的长度是："+ arr.length);
		//打印所有
		for(int i = 0; i< arr.length; i++){
			System.out.println(arr[i]);
		}

		//2.数组的动态声明法
		int arr2 [] = new int[10]; //默认数组内值都是0
		char arrChar[] = new char[10]; //默认打印出来是空字符

		for(int i = 0; i<arr2.length; i++){
			System.out.println(arr2[i]);

		}

		for(int i = 0; i<arrChar.length; i++){
			System.out.println(arrChar[i]);
		}
	}
}