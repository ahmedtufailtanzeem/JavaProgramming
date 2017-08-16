package org.tanzeem.chap2;

public class LinkedList {
	public Object data;
	public LinkedList next;

	public LinkedList() {

	}

	public LinkedList(Object data, LinkedList next) {
		this.data = data;
		this.next = next;
	}


	public static void main(String[] args) {

		Vehical ertiga = new Vehical();
		ertiga.currentDirection = 10.60;
		ertiga.currentSpeed = 50;
		ertiga.ownerName = "Alex";
		ertiga.regNum = Vehical.nextId++;

		Vehical swift = new Vehical();
		swift.currentDirection = 20.5;
		swift.currentSpeed = 100;
		swift.ownerName = "Ben";
		swift.regNum = Vehical.nextId++;

		Vehical dzire = new Vehical();
		ertiga.currentDirection = 100.50;
		ertiga.currentSpeed = 120;
		ertiga.ownerName = "Celie";
		ertiga.regNum = Vehical.nextId++;

		LinkedList ertigaNode = new LinkedList();
		ertigaNode.data = ertiga;

		LinkedList swiftNode = new LinkedList();
		swiftNode.data = swift;
		ertigaNode.next = swiftNode;

		LinkedList dzireNode = new LinkedList();
		dzireNode.data = dzire;
		swiftNode.next = dzireNode;
	}
}
