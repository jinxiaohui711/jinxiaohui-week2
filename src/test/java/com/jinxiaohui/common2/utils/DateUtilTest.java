package com.jinxiaohui.common2.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 0, 1);
		Date randomDate = DateUtil.randomDate(calendar.getTime(), new Date());
		System.out.println(sdf.format(randomDate));
	}

}
