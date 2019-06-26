package cn.lzu.io;

import java.io.UnsupportedEncodingException;

public class ContentDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "性命生命使命a";
		//编码字节数组
		//默认使用工程的字符集
		byte[] dates = msg.getBytes(); 
		
		//解码
		msg = new String(dates, 0, dates.length, "GBK");
		System.out.println(msg);

	}

}
