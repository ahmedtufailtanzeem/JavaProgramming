package org.tanzeem.chap2;

public class Concepts {

	public static void main(String[] args) {

	}

}

// For a member to be accessible from a section of code in some class, the member's class must first be accessible from that code.
class Members {

	private int pri;
	protected int pro;
	int def;
	public int pub;

	private class Inner {

	}

	protected class InnerProtected {

	}
}
