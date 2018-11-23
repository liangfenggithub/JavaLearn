import org.liangfeng.useradmin.io.IOUtils;

import java.util.Properties;

/**
 * @suthor liangfeng
 * @create 2018-10-21 18:45)
 */
public class UserAdminUI {
    private static Properties properties = null;
    //静态代码块是什么？？？？
    static{
        properties = IOUtils.loadProperties("resources","info.properties");
    }
    public void loadUI(){
        System.out.println(getHelpInfo("welcome"));
    }
    public String getHelpInfo(String key){
        String helpinfo = properties.getProperty(key);
        return helpinfo;
    }
}
