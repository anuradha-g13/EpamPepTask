package com.test.java;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.main.java.First2ARemove;

public class First2ARemoveTest {
	/*
	 * Remove A from first 2 char
	 * 1.ABCD => BCD
	 * 2. AACD => CD
	 * 3. BACD => BCD
	 * 4. AABAA => BAA
	 */

	@Test
	public void test1stA() {
		First2ARemove removeChar = new First2ARemove();
		String actual = removeChar.remove("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	public void test2A() {
		First2ARemove removeChar = new First2ARemove();
		String actual = removeChar.remove("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	public void test2ndA() {
		First2ARemove removeChar = new First2ARemove();
		String actual = removeChar.remove("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	public void test1stAndLast2A() {
		First2ARemove removeChar = new First2ARemove();
		String actual = removeChar.remove("AABAA");
		assertEquals("BAA",actual);
	}
}
