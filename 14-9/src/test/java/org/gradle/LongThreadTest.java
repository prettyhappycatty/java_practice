package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongThreadTest {
	@Test
    public void createLongThreadTest(){
		ThreadGroup tg = new ThreadGroup("thread group");
		LongThread lt = new LongThread("test long thread", tg);
		assertEquals("test long thread", lt.getName());
	}
}
