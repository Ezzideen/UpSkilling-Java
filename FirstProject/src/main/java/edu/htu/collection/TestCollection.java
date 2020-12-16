package edu.htu.collection;

import java.util.ArrayList;
import java.util.HashMap;

import edu.htu.day8.Persone;

public class TestCollection {

	public static void main(String[] args) {
		Persone persone = new Persone(1, "Sarah");
		ArrayList<Persone> listOfPersones = new ArrayList<>();
//		listOfPersones.add(1);
//		listOfPersones.add("Ali");
		listOfPersones.add(persone);
	
		for (int i = 0; i < listOfPersones.size(); i++) {
			Persone persone2 = listOfPersones.get(i);
			System.out.println(persone2.getId());
			System.out.println(persone2.getName());
		}
//		
//		int size = list.size();
//		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
		Persone persone2 = new Persone(1, "Sarah");
//		boolean contains = list.contains(persone2);
//		System.out.println(contains);
		
//		list.isEmpty();
//		System.out.println(list.indexOf(persone2));
//		
//		Vector vector = new Vector();
//		vector.add("Mohammad");
//		vector.add(new Persone(15, "Nour"));
//		vector.add(15);
		
//		System.out.println(vector.get(0));
//		System.out.println(vector.get(1));
//		System.out.println(vector.get(2));
		
		HashMap map = new HashMap();
		map.put(1, "Ali");
		map.put(2, persone);
		map.put(persone, "Sarah");
		
		Object object = map.get(persone);
		System.out.println(object);
		
		
	}
	
}
