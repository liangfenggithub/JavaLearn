import java.io.*;
public class Test{
	public static void main(String [] args){
		FileInputStream filein = null;
		FileOutputStream fileout = null;
		try{
			filein = new FileInputStream("from.txt");
			fileout = new FileOutputStream("to.txt");
			byte[] buffer = new byte[1024];
			int temp = 0;
			while(true){
				temp = filein.read(buffer,0,buffer.length);
				if(temp== -1)//读取完毕则返回-1
				{
					break;
				}
				fileout.write(buffer,0,temp);
			}
			System.out.println("文件写入完毕");


		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				filein.close();//关闭io流
				fileout.close();
			}
			catch(Exception	e){
				System.out.println(e);
			}

		}

		

	}
}