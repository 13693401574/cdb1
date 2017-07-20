package org.myitems.cdb1.tools;

import java.sql.Date;

public class DateChange {

	/**
	 * 将字符串转化日期类型，如果数据不合法返回null
	 * @param txt 字符串
	 * @return 日期对象
	 */
	public static Date getDate(String txt){
		if(txt!=null&&txt.matches("\\d{4}-\\d{2}-\\d{2}")){
			return Date.valueOf(txt);
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(getDate("2017-06-02"));
	}

}
