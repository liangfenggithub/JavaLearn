import java.io.*;
class Test{
	public static void main(String[] args){
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try{
			fileReader = new FileReader("user.txt"); 
			//凡使用处理流，必先有字节流
			bufferedReader = new BufferedReader(fileReader);//把fileReader对象作为参数传入BufferReader构造函数
			// String line = bufferedReader.readLine();
			// System.out.println(line);
			String line = null;
			while(true){
				line = bufferedReader.readLine();
				if(line == null){
					break;
				}
				System.out.println(line);
			}
		}
		catch(Exception e){

		}
		finally{
			try{
				bufferedReader.close();
				fileReader.close();
			
			}
			catch(Exception	e){
				System.out.println(e);
			}
			
		}
	}
}