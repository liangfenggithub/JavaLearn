package org.liangfeng.useradmin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author liangfeng
 * @create 2018-10-21 18:35)
 */
//该类包含常用的io工具类函数
public class IOUtils {
    public static Properties loadProperties(String dir, String fileName){
        Properties properties = new Properties();
        String projectPath = System.getProperty("user.dir");
        String propertiesPath = projectPath+ File.separator+dir+File.separator+fileName;
        try{
            properties.load(new FileInputStream(new File(propertiesPath)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return properties;
    }

}
