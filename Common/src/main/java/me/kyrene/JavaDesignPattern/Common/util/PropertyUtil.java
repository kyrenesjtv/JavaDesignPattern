package me.kyrene.JavaDesignPattern.Common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by wanglin on 2017/11/29.
 */
public class PropertyUtil {

    //加载property文件到io流里面
    public static Properties loadProperties(String propertyFile) throws IOException {
        Properties properties = new Properties();
            InputStream is = PropertyUtil.class.getClassLoader().getResourceAsStream(propertyFile);
            if(is == null){
                is = PropertyUtil.class.getClassLoader().getResourceAsStream(propertyFile);
            }
            properties.load(is);
        return properties;
    }

}
