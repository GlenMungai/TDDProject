package com.ait.tdd.mavenprojecttdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestPassword 
{
	PasswordValidator pv;
    @Before
    public void setUp() throws Exception{
    	pv = new PasswordValidator();
    }
    
	
    @Test
    public void TestPasswordLength()
    {
        assertEquals( true, pv.isValid("Abc123"));
    }
}
