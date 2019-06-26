package cn.lzu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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

public class IOTest03 {

	public static void main(String[] args) {
		//1、创建源
		File src = new File("abc.txt");
		//2.选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//3.操作
			byte[] flush = new byte[1024];//缓冲容器
			int lens = -1;
			while((lens=is.read(flush))!=-1) {
				String str = new String(flush,0,lens);
				System.out.println(str);
			}
		
		} catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4.释放资源
			try {
				if(null!=is) {
					
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
