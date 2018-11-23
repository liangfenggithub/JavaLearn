import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.util.Properties;



class Test{
	public static void main(String[] args){
		//1.本文件路径（为了得到properties文件的路径）
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		//2.new properties对象
		Properties properties = new Properties();

		//3.读取文件
		String propertiesPath = projectPath+File.separator+"resources"+File.separator+"first.properties";
		try{
			InputStream in = new FileInputStream(propertiesPath);
			//4.装载对象
			properties.load(in);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

		//5.读取对象
		System.out.println(properties.get("name"));
		System.out.println(properties.get("key1"));
		System.out.println(properties.get("key2"));
		
	}
}