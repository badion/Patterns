package com.study.wrappers.decorator;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomHashSet<E> extends ForwardingSet<E> {

	private int addCount = 0;

	public CustomHashSet(Set<E> s) {
		super(s);
	}

	@Override
	public boolean add(Object e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

	@Override
	public String toString() {
		return "CustomHashSet [addCount=" + addCount + ", getAddCount()="
				+ getAddCount() + ", size()=" + size() + ", isEmpty()="
				+ isEmpty() + ", iterator()=" + iterator() + ", toArray()="
				+ Arrays.toString(toArray()) + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
