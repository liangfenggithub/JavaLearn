import java.io.BufferedReader;
import java.io.InputStreamReader;
//实现输入数字n，判断各位数字的奇数偶数的个数
class Test{
	
	public static void main(String[] arg){
		int oldCount = 0; //奇数
		int evenCounte = 0;//偶数
		int bitCount = 0; //总位数
		BufferedReader bufferedReader;

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("请输入多位数字：");
			try{
				String input = bufferedReader.readLine();
				bitCount = input.length();//得到位数
				System.out.println(input);
				int number = Integer.parseInt(input);//String类型转换为int型
				
				for(int i = 0; i<bitCount; i++){
					int ys = number%10;//取余数
					if(ys%2 == 0){//判断奇数偶数
						evenCounte++;
					}else{
						oldCount++;
					}
					number = number / 10;
				}
				System.out.println("您输入的是："+ input);
				System.out.println("基数个数: "+ oldCount);
				System.out.println("基数个数: " + evenCounte);
				System.out.println("总位数为: " + bitCount);
				oldCount = 0;
				evenCounte = 0;
				bitCount = 0;
			}
			catch(Exception e){
				System.out.println(e);
			}
			
		}
	}
}