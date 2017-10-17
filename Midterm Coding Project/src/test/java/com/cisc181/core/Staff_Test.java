package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		com.cisc181.core.Staff.getnerateSamples();
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
