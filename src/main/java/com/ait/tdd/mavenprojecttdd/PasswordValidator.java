package com.ait.tdd.mavenprojecttdd;

/**
 * Hello world!
 *
 */
public class PasswordValidator 
{
    public boolean isValid(String Password) {
    	if(Password.length()>= 5 && Password.length()<=10) 
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
