package org.tanzeem.extending.classes;

public class Attr {

	private final String name;
	private Object value;

	public Attr(String name) {
		this.name = name;
	}

	Attr(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

	// return the previous set value
	public Object setValue(Object newValue) {
		Object oldVal = value;
		value = newValue;
		return oldVal;
	}

	public String toString() {
		return name + "='" + value + "'";
	}
}
