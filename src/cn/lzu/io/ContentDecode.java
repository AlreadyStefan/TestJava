package cn.lzu.io;

import java.io.UnsupportedEncodingException;

public class ContentDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "��������ʹ��a";
		//�����ֽ�����
		//Ĭ��ʹ�ù��̵��ַ���
		byte[] dates = msg.getBytes(); 
		
		//����
		msg = new String(dates, 0, dates.length, "GBK");
		System.out.println(msg);

	}

}
