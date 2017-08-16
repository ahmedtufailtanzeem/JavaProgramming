package org.tanzeem.chap2;

public class Vehical {

	public int currentSpeed;
	public double currentDirection;
	public String ownerName;
	public int regNum; // not final candidate, not known during vehical creation, also infrequently change - change of state

	public static int nextId = 0;

	public Vehical() {

	}

	public Vehical(String name) {
		ownerName = name;
	}

	public static void main(String[] args) {
		Vehical ertiga = new Vehical("Alex");
		ertiga.currentDirection = 10.60;
		ertiga.currentSpeed = 50;
		ertiga.regNum = nextId++;

		System.out.println(String.format("%s %s %s %s", ertiga.currentDirection, ertiga.currentSpeed, ertiga.ownerName, ertiga.regNum));
	}
}

