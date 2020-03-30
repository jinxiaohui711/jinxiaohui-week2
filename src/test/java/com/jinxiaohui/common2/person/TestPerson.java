package com.jinxiaohui.common2.person;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.jinxiaohui.common2.utils.DateUtil;
import com.jinxiaohui.common2.utils.RandomUtil;
import com.jinxiaohui.common2.utils.StringUtil;

public class TestPerson {

	@Test
	public void testPerson() {
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 10000; i++) {
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(140));
			Calendar calendar = Calendar.getInstance();
			calendar.set(2010, 0, 1);
			person.setCreateDate(DateUtil.randomDate(calendar.getTime(), new Date()));
			list.add(person);
		}
		
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
}
