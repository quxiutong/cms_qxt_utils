package com.qxt.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumUtilTest {

	@Test
	public void test() {
		Number str=1.23;
		String number = NumUtil.isNumber(str);
		System.out.println(number);
	}

}
