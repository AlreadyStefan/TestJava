package cn.lzu.wy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ���Ա�����ݵĴ洢
 * @author Stefan
 *
 */

public class TestStoreData {

	public static void main(String[] args) {


		Map<String, Object> row1 = new HashMap<String, Object>();
		row1.put("id", 1001);
		row1.put("����", "����");
		row1.put("нˮ", 30000);
		row1.put("��ְ����", "2018.5.5");
		
		Map<String, Object> row2 = new HashMap<String, Object>();
		row2.put("id", 1002);
		row2.put("����", "����");
		row2.put("нˮ", 30000);
		row2.put("��ְ����", "2005.4.4");
		
		Map<String, Object> row3 = new HashMap<String, Object>();
		row3.put("id", 1003);
		row3.put("����", "����");
		row3.put("нˮ", 30000);
		row3.put("��ְ����", "2020.5.4");
		
		List<Map<String, Object>> table1 = new ArrayList<Map<String,Object>>();
		table1.add(row1);
		table1.add(row2);
		table1.add(row3);
		
		
		for(Map<String, Object> row:table1) {
			Set<String> keyset = row.keySet();
			for(String key:keyset) {
				System.out.print(key+":"+row.get(key)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
//		for(Map<String, Object> row:table1) {
//			Set<String> keyset = row.keySet();
//			for(String key:keyset) {
//				System.out.print(key+":"+row.get(key)+"\t");
//				
//			}
//			System.out.println();
//		}

	}

}
