package LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU extends LinkedHashMap<Integer, Integer> {
	private int capacity;

	public LRU(int capacity) {
		super(16, 0.75f, true);
		this.capacity = capacity;
	}
	//overwrite
	public Integer get(Object key) {
		Integer v = super.get(key);
		if (v != null)
			return v;
		else
			return -1;
	}
	//overwrite
	public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return size() > capacity;
	}

	public void set(int key, int value) {
		super.put(key, value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU a = new LRU(1);
		a.set(2,1);
		System.out.println(a.get(2));
		a.set(3,2);
		System.out.println(a.get(2));
		a.set(3,3);
		System.out.println(a.get(3));
	}

}
