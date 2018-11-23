import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @suthor liangfeng
 * @create 2018-10-21 16:46)
 */
public class Test {
    public static void main(String[] args) {
        //1.实例化资源文件对象
        Properties properites = new Properties();
        //2.获取当前文件路径（为了得到资源文件路径
        String projectPath = System.getProperty("user.dir");

        //2.载入资源文件
        //2.1 拼接资源文件路径
        String propertiesPath = projectPath +  File.separator + "resources" + File.separator+"first.properties";//File.separator是路径间的斜杠

        try{
            //2.2读取properties文件
            InputStream in = new FileInputStream(propertiesPath);
            //2.3 装载文件到对象中
            properites.load(in);
            System.out.println(properites.get("key1"));
            System.out.println(properites.get("key2"));
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
