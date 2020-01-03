package com.itdr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    public static String getValue(String key){
         Properties p =new Properties();
         InputStream in  = PropertiesUtil.class.getClassLoader().getResourceAsStream("st.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取值
        return p.getProperty(key);

    }
}
