package com.jinxiaohui.common2.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength("1");
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		boolean hasText = StringUtil.hasText("     ");
		System.out.println(hasText);
	}

	@Test
	public void testGetChinese() {
		String chinese = StringUtil.getChinese();
		System.out.println(chinese);
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(10);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() {
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}

}
