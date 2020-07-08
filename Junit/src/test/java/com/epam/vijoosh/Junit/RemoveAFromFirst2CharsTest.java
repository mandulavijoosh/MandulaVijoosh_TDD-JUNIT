package com.epam.vijoosh.Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class RemoveAFromFirst2CharsTest {
	
	/*TODO LIST
	 * 1.ABCD => BCD success
	 * 2.AACD => CD success
	 * 3.BACD => BCD success
	 * 4.BBAA =>BBAA success
	 * 5.AABAA => BAA success
	 * 6.AA => "" success
	 * 7.A =>"" success
	 * 8.B => B success
	 * 9."" => "" success
	 */ 
	
	RemoveAat0and1index removeAat0and1index;
	
	@BeforeEach
	void setUp(){
		removeAat0and1index=new RemoveAat0and1index();
	}
	
	@Test
	void testremoveAfrom1st2ndchar1() {
		assertEquals("BCD",removeAat0and1index.remove("ABCD"));
	}
	
	@Test
	void testremoveAfrom1st2ndchar2() {
		assertEquals("CD",removeAat0and1index.remove("AACD"));	
	}
	
	@Test
	void testremoveAfrom1st2ndchar3() {
		assertEquals("BCD",removeAat0and1index.remove("BACD"));	
	}
	
	@Test
	void testremoveAfrom1st2ndchar4() {
		assertEquals("BBAA",removeAat0and1index.remove("BBAA"));
	}
	
	@Test
	void testremoveAfrom1st2ndchar5() {
		assertEquals("BAA",removeAat0and1index.remove("AABAA"));
	}

	@Test
	void testremoveAfrom1st2ndchar6() {
		assertEquals("",removeAat0and1index.remove("AA"));
	}
	
	@Test
	void testremoveAfrom1st2ndchar7() {
		assertEquals("",removeAat0and1index.remove("A"));
	}
	
	@Test
	void testremoveAfrom1st2ndchar8() {
		assertEquals("B",removeAat0and1index.remove("B"));
	}
	
	@Test
	void testremoveAfrom1st2ndchar0() {
		assertEquals("",removeAat0and1index.remove(""));
	}
}