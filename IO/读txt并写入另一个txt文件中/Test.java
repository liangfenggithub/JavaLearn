// 1.导入类
import java.io.*;
class Test{
	public static void main(String[] args){
		//2.声明输入流引用
		FileInputStream file = null;//创建一个引用
		FileOutputStream fileout = null;
		try{
			//3.生成代表输入流的对象
			file = new FileInputStream("from.txt");//参数是路径+文件
			fileout = new FileOutputStream("to.txt");
			byte [] buffer = new byte[100];
			//4.读取数据
			int temp = file.read(buffer,0,buffer.length);
			for(int i = 0; i< buffer.length; i++){
				System.out.println(buffer[i]);
			}
			//5.以字符方式打印
			String s = new String(buffer);//将buffer数组作为参数传入到String的构造函数中，会生成字符型的字符串
			s = s.trim();//去掉收尾空格和空字符
			System.out.println(s);

			//6.写入数据
			fileout.write(buffer,0,temp);

		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
}