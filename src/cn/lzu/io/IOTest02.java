package cn.lzu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 第一个程序         标准
 * 1、理解操作步骤
 * 创建源
 * 选择流
 * 操作
 * 释放
 * @author Stefan
 *
 */

public class IOTest02 {

	public static void main(String[] args) {
		//1、创建源
		File src = new File("abc.txt");
		//2.选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//3.操作
			int temp;
			while((temp=is.read())!=-1) {
				System.out.println((char)temp);
			}
//			int data1 = is.read();
//			int data2 = is.read();
//			int data3 = is.read();
//			int data4 = is.read();
////			
//			System.out.println((char)data1);
//			System.out.println((char)data2);
//			System.out.println((char)data3);
//			System.out.println((char)data4);
		
		} catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//4.释放资源
			try {
				if(null!=is) {
					
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
