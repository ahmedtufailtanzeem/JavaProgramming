package org.tanzeem.chap2;

public class Vehical {

	public int currentSpeed;
	public double currentDirection;
	public String ownerName;
	public int regNum; // not final candidate, not known during vehical creation, also infrequently change - change of state

	public static int nextId = 0;
}
