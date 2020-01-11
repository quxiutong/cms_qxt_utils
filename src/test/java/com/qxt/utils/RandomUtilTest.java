package com.qxt.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 100; i++) {
			int random = RandomUtil.random(10, 20);
			System.out.println(random);
		}
	}

	@Test
	public void testSubRandom() {
		for (int i = 0; i < 10; i++) {
			int[] random = RandomUtil.subRandom(1, 10, 3);
			for (int j : random) {
				System.out.print(j + ",");
			}
			System.out.println();
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 100; i++) {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(4);
		System.out.println(randomString);
	}

}
