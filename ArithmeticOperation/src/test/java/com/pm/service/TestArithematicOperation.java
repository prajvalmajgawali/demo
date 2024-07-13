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
    	int val1 = 100;
    	int val2 = 200;
    	int excepted = 300;
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
