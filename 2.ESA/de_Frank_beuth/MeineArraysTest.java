package de_Frank_beuth;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Norman Frank on 20.10.15.
 */

public class MeineArraysTest {
	
	private MeineArrays testArray;
	
	@Before
	public void init() {
	testArray = new MeineArrays();
	}
	
	@Test
	public void testNull() {
		int[] ar = new int [0];
		int result = testArray.binarySearchRecursiv(ar, 1);
		assertEquals(-1, result);
		assertEquals(1, testArray.getcallCount());
	}
	
	@Test
	public void testEinElement() {
		int[] ar = {3};
		int result = testArray.binarySearchRecursiv(ar, 1);
		assertEquals(0, result);
		assertEquals(1, testArray.getcallCount());
	}
	
	@Test
    public void testMehrereElemente() {
        int[] ar = {3, 5, 6, 9, 13, 18, 34, 46};
        int result = testArray.binarySearchRecursiv(ar, 9);
		assertEquals(8, result);
		assertEquals(1, testArray.getcallCount());	
    }
	
	@Test
    public void testElementeAmAnfang() {
        int[] ar = {3, 5, 6, 9, 13, 18, 34, 46};
        int result = testArray.binarySearchRecursiv(ar, 3);
		assertEquals(8, result);
		assertEquals(1, testArray.getcallCount());	
    }
	
	@Test
    public void testElementeAmEnde() {
        int[] ar = {3, 5, 6, 9, 13, 18, 34, 46};
        int result = testArray.binarySearchRecursiv(ar, 46);
		assertEquals(8, result);
		assertEquals(1, testArray.getcallCount());	
    }
}
