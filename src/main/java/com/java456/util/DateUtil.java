package com.java456.util;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.scheduling.commonj.ScheduledTimerListener;

import com.mysql.fabric.xmlrpc.base.Data;

/**
 * 日期工具类
 * @author Administrator
 */
public class DateUtil {

	public static void main(String s[]) throws Exception{
		System.out.println(dateToWeek("2018-01-01"));
	}
	
	
	/**
	 * yyyyMMdd hhmmssSSS
	 * 日期对象转字符串
	 */
	public static String formatDate(Date date,String format){
		String result="";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date!=null){
			result=sdf.format(date);
		}
		return result;
	}
	
	/**
	 * 字符串转日期对象
	 * @param str
	 * @param format
	 * @return
	 * @throws Exception
	 */
	public static Date formatString(String str,String format) throws Exception{
		if(StringUtil.isEmpty(str)){
			return null;
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(str);
	}
	
	
	public static String getCurrentDateStr()throws Exception{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}
	
	
	/**
	 * 输入一个月份，2017-01
	 * 输出   2017-01-31
	 */
	public static String getDays(String str){
		str = dateAddMonth(str, "yyyy-MM", 1);//2017-01---2017-02
		str = str+"-01";//2017-02-01
		str = dateAddDay(str, "yyyy-MM-dd", -1);////2017-01-31
		return str;
	}
		
		/**
		 * 算2个时间差几分
		 * @param end
		 * @param begin
		 * @return
		 */
		public static long date_between(Date end,Date begin ){
			/*SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			   Date begin=dfs.parse("2004-01-02 11:30:24");
			   Date end = dfs.parse("2004-01-02 11:31:40");*/
			   long between=(end.getTime()-begin.getTime())/1000;//除以1000是为了转换成秒
			   long min=between/60;
			   System.out.println("差几分"+min);
			   return min;
		}
		
		
		/**
		 *  任意格式的日期
		 * @param date1
		 * @param date2
		 * @return 1比2大 返回1   相等返回0   小于返回-1
		 */
		public static int compareTo(String date1,String date2){
			return date1.compareTo(date2);
		}
		
		
		

		/**
		 * 任意格式 加1天  或者  加-1天
		 * @param dateStr 时间字符串 2018-05-05 12:11
		 * @param dateFormat   时间格式   yyyy-MM-dd HH:mmssSSS
		 * @param n  加多少天
		 */
		public static String dateAddDay(String dateStr,String dateFormat,  int n) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				Calendar cd = Calendar.getInstance();
				cd.setTime(sdf.parse(dateStr));
				cd.add(Calendar.DATE, n);// 增加一天
				// cd.add(Calendar.MONTH, n);//增加一个月
				return sdf.format(cd.getTime());

			} catch (Exception e) {
				return null;
			}
		}
		
		
		/**
		 * 任意格式 加1月  或者  加-1月
		 * @param dateStr 时间字符串 2018-05-05 12:11
		 * @param dateFormat   时间格式   yyyy-MM-dd HH:mmssSSS
		 * @param n  加多少月
		 */
		public static String dateAddMonth(String dateStr,String dateFormat,  int n) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				Calendar cd = Calendar.getInstance();
				cd.setTime(sdf.parse(dateStr));
				//cd.add(Calendar.DATE, n);// 增加一天
				cd.add(Calendar.MONTH, n);//增加一个月
				return sdf.format(cd.getTime());

			} catch (Exception e) {
				return null;
			}
		}
		
		
		/**
		 * 任意格式   加1小时  或者  加-1小时
		 * @param dateStr 时间字符串 2018-05-05 12:11
		 * @param dateFormat   时间格式   yyyy-MM-dd HH:mmssSSS
		 * @param n  加多少月
		 */
		public static String dateAddHour(String dateStr,String dateFormat,  int n) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				Calendar cd = Calendar.getInstance();
				cd.setTime(sdf.parse(dateStr));
				cd.add(Calendar.HOUR, n);//增加一个月
				return sdf.format(cd.getTime());
			} catch (Exception e) {
				return null;
			}
		}
		
		
		/**
		 * @param datetime  2018-01-01
		 * @return  星期一
		 */
	    public static String dateToWeek(String datetime) {
	        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
	        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
	        Calendar cal = Calendar.getInstance(); // 获得一个日历
	        Date datet = null;
	        try {
	            datet = f.parse(datetime);
	            cal.setTime(datet);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
	        if (w < 0)
	            w = 0;
	        return weekDays[w];
	    }
	    
		
}
