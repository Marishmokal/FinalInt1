package map.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToIterate {
public static void main(String[] args) {
	
	HashMap<Integer,String>hm=new HashMap<>();
	hm.put(48,"Marish");
	hm.put(9,"vaibhav");
	hm.put(77,"Pranav");
	hm.put(25,"Akshay");
	
	//iterate by using entrySet
//	Set<Entry<Integer,String>>s=hm.entrySet();
//	Iterator<Entry<Integer,String>>itr=s.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
	//iterate by using keyset
//	Set<Integer>s1=hm.keySet();
//	Iterator<Integer>it=s1.iterator();
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
	
//	//iterate by using for each loop
//	Set<Entry<Integer,String>>s3=hm.entrySet();
//	Iterator<Entry<Integer,String>>itr=s3.iterator();
//	for (Entry<Integer, String> entry : s3) {
//		System.out.println(entry);
//	}
	
//	//iterate by using values
	Collection<String>s4=hm.values();
	System.out.println(s4);
	
	
	//HashMap sort By values
	Set<Entry<Integer,String>>s5=hm.entrySet();
	ArrayList<Entry<Integer,String>>arr=new ArrayList<>();
	Collections.sort(arr,new SortByValue());
	for (Entry<Integer, String> en : arr) {
		System.out.println(en);
	}
	
	
	
}
}
