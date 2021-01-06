package kh.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kh.java.collection.set.Person;

public class HashMapTest {

	public static void main(String[] args) {
		HashMapTest h = new HashMapTest();
//		h.test1();
		h.test2();
	}
	/*
	 * 전체 요소 열람하기
	 * 1. key값을 set에 담아서 하는 방식
	 * 2. key,value한쌍을 set에 담는방식   
	 */
	private void test2() {
		Map<String, Person> map = new HashMap<>();
		map.put("ming",new Person("송민성"));
		map.put("TY",new Person("tyler"));
		map.put("IG",new Person("instargrag"));
		map.put("Fxxx",new Person("Fuck"));
		
		//1. keySet을 이용해서 불러오기 keySet = key집합
		Set<String> keySet = map.keySet();
		//keySet + iterator
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		
		//keySet + forEach
		
		Set<String> keySet2 = map.keySet();
		for (String key : keySet2) {
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		System.out.println("---------------------------------");
		
		//2. amp.Entry(key,value한쌍) Set
		Set<Entry<String, Person>> entrySet = map.entrySet();
		//entrySet + forEach
		for(Entry<String,Person> entry : entrySet) {
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		
		
		//entrySet + iterator
		Iterator<Entry<String, Person>> iter2 = entrySet.iterator();
		while(iter2.hasNext()) {
			Entry<String, Person> entry = iter2.next();
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		
	}
	/*
	 * Map
	 * key, Value 한쌍으로 요소를 구성한다.
	 * key를 통해서 value를 접근해 사용.
	 * key는 중복을 허용하지 않는다.
	 * value는 중복되어도 ㄱㅊ.
	 * 
	 * 동일한 key로 추가 저장하면, 나중 value로 치환된다.
	 * 
	 */
	private void test1() {
	//<K, V> 두개의 제네릭을 사용
	//key로 Integer만 허용
	//value로 String만 허용.
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Character, Person> map2 = new HashMap<>();
		
		//요소추가
		map1.put(1,"송민성");
		map1.put(2,"tyler");
		map1.put(3,"instar : dev_addictied");
		
		//요소 가져오기
		String s1 = map1.get(1);
		System.out.println(s1);
		
		//동일한 키값으로 요소 추가
		map1.put(2, "장영실");
		System.out.println(map1);
		
		//map2에 요소추가
		map2.put('a',new Person("Adia"));
		map2.put('b',new Person("Bob"));
		map2.put('c',new Person("Tyler"));
		map2.put('d',new Person("David"));
		
		//equals&hashCode Overriding을 전제로한다.
		//특정key가 존재하는가?
		System.out.println(map2.containsKey('b'));//char -> new Character('b');
		System.out.println(map2.containsKey('x'));//char -> new Character('x');
		
		//특정 value가 존재하는가?
		System.out.println(map2.containsValue(new Person("David")));
		
		Person p1 = map2.get('b');
		System.out.println(p1+ ", " + p1.hashCode());
		map2.put('b', new Person("Bill"));
		Person p2 = map2.get('b');
		System.out.println(p2+ ", " + p2.hashCode());
		System.out.println(p1+ ", " + p1.hashCode());
	}

}
