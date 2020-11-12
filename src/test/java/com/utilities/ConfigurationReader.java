package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Properties;

public class ConfigurationReader {

    private  static Properties properties=new Properties();
    static{

        String path="configuration.properties";

        try {
            FileInputStream file= new FileInputStream(path);
            properties.load(file);
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found");
        }


    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

//    //1- we created properties object
//    private static Properties properties = new Properties();
//
//
//   static {
//        //2- get the path and store in String, or directly pass into fileInputStream obj
//        String path = "configuration.properties";
//
//        try{
//            //3- we need to open the file
//            FileInputStream file = new FileInputStream(path);
//            //4- we need to load the file to properties object
//            properties.load(file);
//
//            //5- close.file
//            file.close();
//
//        } catch (IOException e) {
//            System.out.println("Properties file not found.");
//        }
//    }
//
//    //Our own custom method to read and get values from configuration.properties file
//    public static String getProperty(String keyWord){
//        return properties.getProperty(keyWord);
//    }
//
//
//

}