package com.pa.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeData {  // 获取当前时间
	public static void timeData(){
		Date time = new Date();
		System.out.println(time.toString());
		SimpleDateFormat now = new SimpleDateFormat ("yyyy-MM-dd");
		System.out.println("进入时间为：" + now.format(time));
	}
}
