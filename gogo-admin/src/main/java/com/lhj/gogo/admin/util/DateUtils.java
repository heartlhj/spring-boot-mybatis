/**
 *
 * 广州睿智信息科技有限公司, 版权所有 违者必究
 * copyright 2015-2020
 * @date 2015年12月1日 下午4:59:30
 * @author yuxiao
 * @Description: Date 工具集
 * 
 */
package com.lhj.gogo.admin.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;


/**
 *
 * @date 2015年12月1日 下午4:59:30
 * @author yuxiao
 * @Description: Date 工具集
 * 
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
	
	private static final String HOLIDAYS_PROPERTIES_PATH = "/config/properties/holidays.properties";
	
	/**
	 * 获取系统当前时间
	 * 
	 * @return
	 */
	public static Date now() {
		long t0 = System.currentTimeMillis();
		Date now = new Date(t0);
		return now;
	}
	
	/**
	 * 返回指定格式的时间字符串
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {
		String str = null;
		
		if(date != null && StringUtils.isNotBlank(pattern)){
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			str = sdf.format(date);
		}
		
		return str;
	}
	
	/**
	 * 返回默认格式的时间字符串，默认格式为：yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 */
	public static String defaultFormatDate(Date date) {
		String str = null;
		
		if(date != null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			str = sdf.format(date);
		}
		
		return str;
	}
	
	/**
	 * 比较两个日期大小
	 * <br>
	 * 0：相等、正数date1大、负数date2大
	 * @param date1
	 * @param date2
	 * @return 时间差
	 */
	public static long compare(Date date1, Date date2) {
		if(date1 == null && date2 == null) {
			return 0;
		}
		if(date1 == null) {
			return -1;
		}
		if(date2 == null) {
			return 1;
		}
		return date1.getTime() - date2.getTime();
	}
	
	/**
	 * 两个日期相减得到年龄
	 * @param Date birthDay
	 * @param Date buyDay
	 * @return 年龄
	 */
	public static int getAge(Date birthDay,Date buyDay) throws Exception {
    	int age;
    	long birth=birthDay.getTime();
    	long buy=buyDay.getTime();
    	if(birth>=buy){
    		 age=0;
    	}else{
    	        Calendar cal1 = Calendar.getInstance(); 
    	        cal1.setTime(birthDay);
    	        int yearBirth = cal1.get(Calendar.YEAR);  
    	        int monthBirth = cal1.get(Calendar.MONTH)+1;  
    	        int dayOfMonthBirth = cal1.get(Calendar.DAY_OF_MONTH); 
    	        
    	        Calendar cal2 = Calendar.getInstance(); 
	       	     cal2.setTime(buyDay);
	       	     int yearNow = cal2.get(Calendar.YEAR);  
    	        int monthNow = cal2.get(Calendar.MONTH)+1;  
    	        int dayOfMonthNow = cal2.get(Calendar.DAY_OF_MONTH);
    	        
    	         age = yearNow - yearBirth;  
    	  
    	        if (monthNow <= monthBirth) {  
    	            if (monthNow == monthBirth) {  
    	                if (dayOfMonthNow < dayOfMonthBirth) 
    	                	age--;  
    	            }else{  
    	                age--;  
    	            }  
    	        } 
    	}
    	return age;
    }
	
	public static Date parse(String strDate, String pattern){  
        try {
			return StringUtils.isBlank(strDate) ? null : new SimpleDateFormat(pattern).parse(strDate);
		} catch (Exception e) {
			return now();
		}  
    }  
	
	/**
	 * 
	 * @date 2017年7月13日 上午11:49:19
	 * @author jie
	 * @Description: 传入时间和天数，得到某个日期，排除自定义的节假日和周六日
	 * @param date
	 * @param count
	 * @return
	 *
	 */
	public static Date getWorkDay(Date date, Long count){
		if(date == null){
			return null;
		}
		
		if(count == null){
			return null;
		}

//		String holidays = "2017-07-10,2017-07-12,2017-07-13,2016-10-01,2016-10-02,2016-10-03,2016-10-04,2016-10-05,2016-10-06,2016-10-07";
		Properties properties = PropertiesUtils.loadProperties(HOLIDAYS_PROPERTIES_PATH);//读取自定义日期
		String holidays = properties.getProperty("holidays");
		
		int everyDay = 0;
		long length = 0;
		Date middleTime = date;
		if(count.intValue() > 0){//正数
			everyDay = 1;
			length = count.intValue();
		}else{//负数
			everyDay = -1;
			length = -count.intValue();
		}
		for(long i=length; i>0; i--){
			middleTime = recursionDate(middleTime, holidays, everyDay);
//			System.out.println(DateUtils.formatDate(middleTime, "yyyy-MM-dd"));
		}
		
		return middleTime;
	}
	
	/**
	 * 
	 * @date 2017年7月13日 下午12:03:03
	 * @author jie
	 * @Description: 递归时间，直到得到不是自定义排除日期的那天
	 * @param middleTime
	 * @param holidays
	 * @param everyDay：一般是1或者-1
	 * @return
	 *
	 */
	private static Date recursionDate(Date middleTime, String holidays, int everyDay){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(middleTime);
//		calendar.add(Calendar.DATE, -1);
		calendar.add(Calendar.DATE, everyDay);
		middleTime = calendar.getTime();
		String middleTimeStr = DateUtils.formatDate(middleTime, "yyyy-MM-dd");
//		System.out.println(middleTimeStr);
//		System.out.println(holidays.contains(middleTimeStr));
		if(holidays.contains(middleTimeStr)){//存在
			middleTime = recursionDate(middleTime, holidays, everyDay);
		}else{
			return middleTime;
		}
		return middleTime;
	}

	/**
	 * 日志转为时间戳
	 * @param paramDate
	 * @return
	 */
	public static Timestamp dateToTimeStamp(java.util.Date paramDate)
	{
		if (paramDate == null) {
			return null;
		}
		return new Timestamp(paramDate.getTime());
	}


}