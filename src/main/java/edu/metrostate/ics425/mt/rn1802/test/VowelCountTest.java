package edu.metrostate.ics425.mt.rn1802.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.metrostate.ics425.mt.rn1802.model.VowelCounter;

class VowelCountTest {

	@Test
	void testGetVowels() {
		VowelCounter vc = new VowelCounter();
		vc.setText("hello World");
		char[] c = {'e','o','o'};
		assertArrayEquals(c, vc.getVowels());
		
	}

	@Test
	void testGetVowelCounts() {
		VowelCounter vc = new VowelCounter();
		vc.setText("hello World");
		int[] count = {0, 1, 0, 2, 0}; //'e','o','o'
		assertArrayEquals(count, vc.getVowelCounts());
	}

}
