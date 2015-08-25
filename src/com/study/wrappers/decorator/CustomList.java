package com.study.wrappers.decorator;

import java.util.List;

public class CustomList<E> extends LayerList<E> {

	public CustomList(List<E> list) {
		super(list);
	}
	
	@Override
	public boolean add(E e) {
		System.out.println("added element " + e);
		return super.add(e);
	}

}
