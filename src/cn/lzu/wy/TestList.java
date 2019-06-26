package cn.lzu.wy;

import java.awt.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class TestList {
	public static void main(String[] args) {
		test03();
		AbstractList<String> ll = new Vector<>();
		
	}

	public static void test01() {
		Collection<String> c = new ArrayList<>();
		
		c.size();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		c.add("wuyuy");
		c.add("faf");
		System.out.println(c);
		System.out.println(c.size());
		
		c.remove("wuyuy");
		System.out.println(c);
		
	}
	
	public static void test02() {

		AbstractList<String> list01 = new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		AbstractList<String> list02 = new ArrayList<>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");
		
		System.out.println("list01:"+list01);
	}
	
	public static void test03() {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		list.add(2,"Œ‰”Ò—˛");
		System.out.println(list);
	}
}

