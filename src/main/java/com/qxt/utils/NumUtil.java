package com.qxt.utils;

import java.util.Collection;

public class NumUtil {
	//判断List、Set之类的对象是否有值，对象为空算没值，对象不为空但没有元素也算没值
	public static boolean isEmpty(Collection<?> src) {
		     boolean b = src.isEmpty();
			return b;
	}
	//该方法是判断参数是否为数字，包含小数
	public static String isNumber(Number number) {
		String string = String.valueOf(number);
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			String string1 = String.valueOf(c);
			if(string1.equals(".")) {
				return "小数";
			}
		}
		return "不是小数";
	}
}
