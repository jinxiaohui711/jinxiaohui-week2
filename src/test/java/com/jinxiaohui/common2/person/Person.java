package com.jinxiaohui.common2.person;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String name;
	private Integer age;
	private String about;
	private Date createDate;
	public Person() {
	}
	public Person(String name, Integer age, String about, Date createDate) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.createDate = createDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "姓名:" + name + "  年龄:" + age + "  介绍:" + about + "   注册日期:" + sdf.format(createDate);
	}
	
}
