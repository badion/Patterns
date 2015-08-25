package com.study.wrappers.decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<E> implements Set<E> {

	private final Set<E> s;

	public ForwardingSet(Set<E> s) {
		this.s = s;
	}

	public int size() {
		return s.size();
	}

	public boolean isEmpty() {
		return s.isEmpty();
	}

	public boolean contains(Object o) {
		return s.contains(o);
	}

	public Iterator iterator() {
		return s.iterator();
	}

	public Object[] toArray() {
		return s.toArray();
	}

	public Object[] toArray(Object[] a) {
		return s.toArray();
	}

	public boolean add(Object e) {
		return s.add((E) e);
	}

	public boolean remove(Object o) {
		return s.remove(o);
	}

	public boolean containsAll(Collection c) {
		return s.containsAll(c);
	}

	public boolean addAll(Collection c) {
		return s.addAll(c);
	}

	public boolean retainAll(Collection c) {
		return s.retainAll(c);
	}

	public boolean removeAll(Collection c) {
		return c.removeAll(c);
	}

	public void clear() {
		s.clear();
	}

}
