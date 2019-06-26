package cn.lzu.wy;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ���Ե���������List��Set��Map
 * @author ������
 *
 */

public class TestIterator {

	public static void main(String[] args) {
		testIteratorList();

	}
	
	public static void testIteratorList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}

}
