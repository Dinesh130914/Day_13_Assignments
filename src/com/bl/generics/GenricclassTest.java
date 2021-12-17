package com.bl.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GenricclassTest {

	@Test
	void testMaximum() {
		assertEquals(16, Genricclass.maximum(16, 12, 8));
		assertEquals(12.36, Genricclass.maximum(10.23, 12.36, 8.36));
		assertEquals("read", Genricclass.maximum("You", "read", "me"));
	}

}
