package com.spirit.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 时间工具类
* <p>Title: TimeUtils</p>
* <p>Description: </p>
* <p>Project: WeShare</p>
* @author 印国林
* @date 2018年9月15日下午1:03:09
 */
public class TimeUtils {
	
	/**
	 * 获取 2018-10-1 12:21:56 格式时间
	 */
	public static String getTime(){
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		return dateFormat.format(date);
		
	}
	
	
	
	/**
	 * 获取最近七天的日期
	 * 
	 */
	public static String[] getRecentSevenDay(){
		
		String[] sevenDay = new String[7];
		
		for (int i = 0; i < 7; i++) {
			Date date=new Date();//取时间
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.add(calendar.DATE,-i);//把日期往后增加一天.整数往后推,负数往前移动
			date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = formatter.format(date);
			sevenDay[i] = dateString;
		}
		return sevenDay;
	}
	
	public static void main(String[] args) {
		System.out.println(getCurrentYear());
	}

    /**
     * get current year
     * @return
     */
	public static int getCurrentYear(){

        String time = getTime();

        String yearChar = time.subSequence(0, 4).toString();

        return Integer.parseInt(yearChar);
    }

	/**
	 * 20180101 --->  2018-01-01
	 * @param date
	 * @return
	 */
	public static String dateFormat(String date){

        String year = date.subSequence(0, 4).toString();

        String month = date.subSequence(4, 6).toString();

        String days = date.subSequence(6, 8).toString();

        return year+"-"+month+"-"+days;
    }
	
}
