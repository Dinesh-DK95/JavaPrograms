package JavaExercise;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class printmap6 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>(); 
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			System.out.println(next.getKey()+"->" + next.getValue());
		}
	}

}
