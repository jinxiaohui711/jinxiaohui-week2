package com.jinxiaohui.common2.utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
    * @ClassName: RandomUtil
    * @Description: TODO(随机数工具类)
    * @author 靳晓辉
    * @date 2020年3月30日
    *
 */
public class RandomUtil {
	/**
	 * 
	    * @Title: random
	    * @Description: TODO(返回min-max之间的随机整数)
	    * @param @param min
	    * @param @param max
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int random(int min,int max) {
		Random random = new Random();
		int nextInt = random.nextInt((max-min)+min);
		return nextInt+1;
	}
	/**
	 * 
	    * @Title: subRandom
	    * @Description: TODO(最小值min与最大值max之间截取subs个不重复的随机数)
	    * @param @param min
	    * @param @param max
	    * @param @param subs
	    * @param @return    参数
	    * @return int[]    返回类型
	    * @throws
	 */
	public static int[] subRandom(int min,int max,int subs) {
		int[] arr = new int[subs];
		List<Integer> list = new ArrayList<>();
		int i=0;
		while (list.size()!=subs) {
			int random = random(min, max);
			if (!list.contains(random)) {
				list.add(random);
				arr[i]=random;
				i++;
			}
		}
		return arr;
	}
	/**
	 * 
	    * @Title: ramdomCharacter
	    * @Description: TODO(返回1个1-9,a-Z之间的随机字符)
	    * @param @return    参数
	    * @return char    返回类型
	    * @throws
	 */
	public static char ramdomCharacter() {
		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
	}
	/**
	 * 
	    * @Title: randomString
	    * @Description: TODO(返回参数length个字符串)
	    * @param @param length
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String randomString(int length) {
		String string ="";
		for (int i = 0; i < length; i++) {
			string+=ramdomCharacter();
		}
		return string;
	}
}
