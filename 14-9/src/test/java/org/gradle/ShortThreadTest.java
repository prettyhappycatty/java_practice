package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortThreadTest {

	@Test
    public void createLongThreadTest(){
		ThreadGroup tg = new ThreadGroup("thread group");
		ShortThread st = new ShortThread("test short thread", tg);
		assertEquals("test short thread", st.getName());
	}
    
}
