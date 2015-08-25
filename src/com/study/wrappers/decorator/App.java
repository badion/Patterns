package com.study.wrappers.decorator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class App implements Lala, Lala1 {

	public static void main(String[] args) {
		// WeakReference<App> app = new WeakReference<App>(new App());
		// ReferenceQueue<App> refQueue = new ReferenceQueue<>();
		// PhantomReference<App> app1 = new PhantomReference<App>(new App(),
		// refQueue);
		//
		// String s1 = "olo";
		// List<Integer> list = new ArrayList<Integer>();
		// list.add(10);
		//
		// String s11 = "oo";
		// String s2 = "ooo";
		//
		// System.out.println(s11.hashCode());
		// System.out.println(s2.hashCode());
		//
		// list = app.get().str(list);
		//
		// Class<? extends List> p = list.getClass();


		Map<Employee, String> emps = new HashMap<Employee, String>();
		emps.put(new Employee(1, 2), "First");
		
		System.out.println(emps.get(new Employee(1, 2)));
		

	}

	public List<Integer> str(List<Integer> integerList) {
		List l = integerList;
		l.add("olo");
		List<Integer> integer = l;
		return integer;
	}

	@Override
	public void some() {
		// TODO Auto-generated method stub

	}

}
