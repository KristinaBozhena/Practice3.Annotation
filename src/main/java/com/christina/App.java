package com.christina;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringBeans.xml");  
    	  
        Country countryObj = (Country) appContext.getBean("CountryBean");  
        String countryName=countryObj.getCountryName();  
        Capital capital=countryObj.getCapital();  
        String capitalName=capital.getCapitalName();  
        System.out.println(capitalName+" is capital of "+countryName);  

    }
}
