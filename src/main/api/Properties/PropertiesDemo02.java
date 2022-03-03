package main.api.Properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();//底层基于map集合
        properties.load(new FileInputStream("src/com/api/Properties/users.properties"));
        System.out.println(properties);
        System.out.println(properties.getProperty("admin"));
        
		Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            String value = properties.getProperty(s);
            System.out.println(s + value);
        }
    }
}