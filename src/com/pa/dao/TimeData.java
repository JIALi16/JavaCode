package com.pa.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeData {  // ��ȡ��ǰʱ��
	public static void timeData(){
		Date time = new Date();
		System.out.println(time.toString());
		SimpleDateFormat now = new SimpleDateFormat ("yyyy-MM-dd");
		System.out.println("����ʱ��Ϊ��" + now.format(time));
	}
}
