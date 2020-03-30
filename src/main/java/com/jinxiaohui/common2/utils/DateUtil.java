package com.jinxiaohui.common2.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 
    * @ClassName: DateUtil
    * @Description: TODO(日期工具类)
    * @author 靳晓辉
    * @date 2020年3月30日
    *
 */
public class DateUtil {

	/**
	 * 
	    * @Title: randomDate
	    * @Description: TODO(注册日期属性值模拟2010年1月1日至今任意随机时间)
	    * @param @param start
	    * @param @param end
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date randomDate(Date start,Date end) {
		long time1 = start.getTime();
		long time2 = end.getTime();
		if (time2<time1) {
			throw  new RuntimeException("结束日期晚于开始日期");
		}
		Calendar c = Calendar.getInstance();
		double time = Math.random()*(time2-time1)+time1;
		c.setTimeInMillis(Math.round(time));
		return c.getTime();
	}
	
}
