package com.demo.MavenOnJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testAdd()
	{
		App obj=new App();
		int x=obj.add(6,7);
		assertEquals(13,x);
	}
}