package com.inetBanking.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig() 
	{
		
		try {
			FileInputStream fis=new FileInputStream("C://Users//Digambar//Desktop//Priyanka Java//inetBanking//Configuration//config.properties");
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.err.println("File Not fount ");
			e.printStackTrace();
		}
	}
    public String getApplicationURL()
    {  
    	String url=pro.getProperty("baseURL");
		return url;
    	
    }
    public String getUsername()
    {
    	String username=pro.getProperty("username");
		return username;
    	
    }
    public String getPassword()
    {
    	String password=pro.getProperty("password");
		return password;
    	
    }
    public String getChromepath()
    {
    	String chromepath=pro.getProperty("chromepath");
		return chromepath;
    	
    }
    public String getIEpath()
    {
    	String iepath=pro.getProperty("iepath");
		return iepath;
    }
    public String getFirefox()
    {
    	String firefox=pro.getProperty("firefoxpath");
		return firefox;
    }
    
}
