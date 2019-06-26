package cn.lzu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 四个步骤  分段读取
 * 1、理解操作步骤
 * 创建源
 * 选择流
 * 操作
 * 释放
 * @author Stefan
 *
 */

public class IOTest04 {

	public static void main(String[] args) {
		//1、创建源
		File dest = new File("dest.txt");
		//2.选择流
		OutputStream os = null;
		try {
			os = new FileOutputStream(dest);
			//3.操作
			String msg = "IO is so easy";
			byte[] datas = msg.getBytes();//编码
			os.write(datas, 0, datas.length);
			os.flush();
		
		} catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4.释放资源
			try {
				if(null!=os) {
					
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
