package com.baiynistx.algorithm.test;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;

public class TreeMapTest {

	public static void main(String[] args){
		TreeMapTest test = new TreeMapTest();
		TreeMap tmap = test.getTreeMapSort();
		test.iteratorTreeMapByEntryset(tmap);
		test.iteratorTreeMapByKeyset(tmap);
		test.iteratorTreeMapJustValues(tmap);
	}


	//参考http://yikun.github.io/2015/04/06/Java-TreeMap%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E5%8F%8A%E5%AE%9E%E7%8E%B0/
	//HashMaHashMap不保证数据有序，LinkedHashMap保证数据可以保持插入顺序，TreeMap可以保持key的大小顺序的
	private TreeMap<String, Integer> getTreeMapSort(){
		TreeMap<String,Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("Java",1);
		tmap.put("Python",3);
		tmap.put("PHP",2);
		tmap.put("C#",4);
		tmap.put("C++",8);
		tmap.put("NodeJs",6);
		tmap.put("Scala",7);
		tmap.put("Clojure",5);
		//tmap可以保持key的大小顺序
		for(Entry<String,Integer> entry : tmap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		return tmap;
	}
	/*
       * 通过entry set遍历TreeMap
       * 效率高!
    */
     private  void iteratorTreeMapByEntryset(TreeMap map) {
		 if (map == null)
			 return ;
		 System.out.println("\niterator TreeMap By entryset");
		 String key = null;
		 Integer integV = null;
		 Iterator iter = map.entrySet().iterator();
		 while(iter.hasNext()) {
			 Map.Entry entry = (Map.Entry)iter.next();

			 key = (String)entry.getKey();
			 integV = (Integer)entry.getValue();
			 System.out.println(key+" -- "+integV.intValue());
		 }
	 }

	/*
       * 通过keyset来遍历TreeMap
       * 效率低!
    */
	private void iteratorTreeMapByKeyset(TreeMap map) {
		if (map == null)
			return ;

		System.out.println("\niterator TreeMap By keyset");
		String key = null;
		Integer integ = null;
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			key = (String)iter.next();
			integ = (Integer)map.get(key);
			System.out.println(key+" -- "+integ.intValue());
		}
	}


	/*
       * 遍历TreeMap的values
     */
	private void iteratorTreeMapJustValues(TreeMap map) {
		if (map == null)
			return ;

		Collection c = map.values();
		Iterator iter= c.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}


}
