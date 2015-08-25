package com.memento;

import java.util.ArrayList;
import java.util.List;

public class H2O {
	private String state;

	public void set(String state) {
		this.state = state;
	}

	public Memento saveToMemento() {
		return new Memento(this.state);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getSavedState();
		System.out.println(state);
	}

	public static class Memento {

		private final String state;

		public Memento(String state) {
			this.state = state;
		}

		public String getSavedState() {
			return state;
		}
	}

	public static void main(String[] args) {
		H2O h2o = new H2O();

		List<H2O.Memento> savedStates = new ArrayList<H2O.Memento>();
		h2o.set("water");
		savedStates.add(h2o.saveToMemento());
		h2o.set("gas");
		savedStates.add(h2o.saveToMemento());
		h2o.restoreFromMemento(savedStates.get(1));
	}
}
