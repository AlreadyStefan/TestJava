package cn.lzu.wy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections辅助类的使用
 * @author 武玉瑶
 *
 */

public class TestCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			list.add("wu:"+i);
		}
		System.out.println(list);
		
		Collections.shuffle(list);//随机排列
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
