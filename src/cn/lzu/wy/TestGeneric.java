package cn.lzu.wy;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestGeneric {

	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<>();
		mc.set("Œ‰”Ò—˛", 0);
//		mc.set(8888, 1);
		
//		Integer a = (Integer)mc.get(1);
//		String b = (String)mc.get(0);
		String b = mc.get(0);
		
		java.util.List list = new ArrayList();
		Map map = new HashMap<>();

	}

}

class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E e, int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
}