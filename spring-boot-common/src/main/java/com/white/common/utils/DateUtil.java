package com.white.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    /**
     * 判断当前日期是星期几
     *@author 枸杞
     *@param pTime 修要判断的时间
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
    public static String dayForWeek(String pTime)  {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(format.parse(pTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int dayForWeek = 0;
        if(c.get(Calendar.DAY_OF_WEEK) == 1){
            dayForWeek = 7;
        }else{
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return String.valueOf(dayForWeek);
    }

    /**
     * 判断当前日期是第几月
     *@author 枸杞
     *@param pTime 修要判断的时间
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
    public static String monuthForYear(String pTime)  {
        String[] split = pTime.split("-");
        int monuth = Integer.parseInt(split[1]);
        return String.valueOf(monuth);
    }

    /**
     * 判断当前日期是第几号
     *@author 枸杞
     *@param pTime 修要判断的时间
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
    public static String dayForMonuth(String pTime)  {
        String[] split = pTime.split("-");
        int day = Integer.parseInt(split[2]);
        return String.valueOf(day);
    }


    /**
     * 取得当月天数
     * */
    public static int getCurrentMonthLastDay() {
        Calendar a = Calendar.getInstance();
        //把日期设置为当月第一天
        a.set(Calendar.DATE, 1);
        //日期回滚一天，也就是最后一天
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 根据 年、月 获取对应的月份 的 天数
     */
    public static int getDaysByYearMonth(int year, int month) {
       Calendar a = Calendar.getInstance();
       a.set(Calendar.YEAR, year);
       a.set(Calendar.MONTH, month - 1);
       a.set(Calendar.DATE, 1);
       a.roll(Calendar.DATE, -1);
      int maxDate = a.get(Calendar.DATE);
      return maxDate;
  }

    /**
     * 获取下一天
     * @param date
     * @return
     */
    public static String getNextDate(Date date){
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        String nextDay="";
        try {
            Date temp = date;
            Calendar cld = Calendar.getInstance();
            cld.setTime(temp);
            cld.add(Calendar.DATE, 1);
            temp = cld.getTime();
            //获得下一天日期字符串
            nextDay = dft.format(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  nextDay;
    }
}
