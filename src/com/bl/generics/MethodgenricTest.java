package com.bl.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodgenricTest {
	Methodgenric md = new Methodgenric();
	@Test
	void testMaximum() {
		assertEquals(23,md.maximum(16, 12, 23));
		assertEquals(65.26,md.maximum(65.26,56.03,45.23));
		assertEquals("read",md.maximum("You","read","me"));
	}

}
