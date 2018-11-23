class Test{
	public static void main(String[] args){
		//二维数组的定义方法
		int arr [][] = {{1,2,3},{4,5,6},{7,8}};
		// System.out.println(arr[1][1]);
		// for(int i = 0; i<3; i++){ //这里会报错，提示数组index超出界限
		// 	for(int j =0; j<3; j++){
		// 		System.out.println(arr[i][j]);
		// 	}
		// }
		// 
		for(int i = 0; i<3; i++){
			for(int j =0; j<arr[i].length; j++){//这样动态判断
				System.out.println(arr[i][j]);
			}
		}

		int char[][] = new char[3][5];
		
	}
}