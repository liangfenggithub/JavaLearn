import java.io.*;
public class TestChar{
	public static void main(String [] args){
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader("from.txt");
			fw = new FileWriter("to.txt");
			char[] buffer = new char[1024];
			int temp = 0;
			while(true){
				temp = fr.read(buffer,0,buffer.length);
				if(temp== -1)//读取完毕则返回-1
				{
					break;
				}
				for(int i = 0; i<temp; i++){
					System.out.println(buffer[i]);
				}
				
				fw.write(buffer,0,temp);
			}
			System.out.println("文件写入完毕");


		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				fr.close();//关闭io流
				fw.close();
			}
			catch(Exception	e){
				System.out.println(e);
			}

		}

		

	}
}