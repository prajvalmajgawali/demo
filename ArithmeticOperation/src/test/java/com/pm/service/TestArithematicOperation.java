package com.pm.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestArithematicOperation 
{
	public static Arithametic ao;
	
    @BeforeAll
	public static void setup()
	{
		System.out.println("TestArithematicOperation.setup()");
		ao = new Arithametic();
	}
    
    
    @Test
    public void setSumWithPositiveNumber()
    {
    	int val1 = 10;
    	int val2 = 20;
    	int excepted = 30;
    	int actual = ao.sum(val1, val2);
        assertEquals(excepted, actual);
    }
    
    @Test
    public void setSumWithNagitiveNumber()
    {
    	int val1 = -10;
    	int val2 = -20;
    	int excepted = -30;
    	int actual = ao.sum(val1, val2);
        assertEquals(excepted, actual);
    }
    
    @Test
    public void setSumWithmixedNumber()
    {
    	int val1 = -10;
    	int val2 = 20;
    	int excepted = 10;
    	int actual = ao.sum(val1, val2);
        assertEquals(excepted, actual);
    }
    
    @AfterAll
	public static void down()
	{
		System.out.println("TestArithematicOperation.down()");
		ao = null;
	}
}
