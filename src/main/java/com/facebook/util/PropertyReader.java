package com.facebook.util;
import java.io.FileInputStream; 
import java.util.Properties;
public class PropertyReader 
{

static Properties envProperties=new Properties();	
static Properties dataProperties=new Properties();	
static Properties configProperties=new Properties();	

static  
{
try
{
envProperties.load(new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//facebook//properties//env.properties"));
String env=envProperties.getProperty("evn");

dataProperties.load(new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//facebook//properties//"+env+"-data.properties"));

configProperties.load(new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//facebook//properties//"+env+"-config.properties")); 
 
}
catch (Exception e) 
{
	 e.printStackTrace();
}
}

 public static String getDataProperty(String key)
 {
	 String value=dataProperties.getProperty(key);
	 return value;
 }
 

 public static String getConfigProperty(String key)
 {
	 String value=configProperties.getProperty(key);
	 return value;
 }
 }


