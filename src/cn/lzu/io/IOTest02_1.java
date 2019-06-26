package cn.lzu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 第一个程序，标准
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放
 * @author 武玉瑶
 *
 */

public class IOTest02_1 {

	public static void main(String[] args) {
		
//		1、创建源
		File src = new File("def.txt");
//		2、选择流
		InputStream is = null;
		
		try {
			is = new FileInputStream(src);
			
//		3、操作	
			int temp;
			while((temp=is.read())!=-1) {
				System.out.println((char)temp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//		4、释放
			if(null!=is) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


	}

}
