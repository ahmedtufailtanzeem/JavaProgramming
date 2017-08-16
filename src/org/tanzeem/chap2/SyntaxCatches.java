package org.tanzeem.chap2;

import java.io.FileNotFoundException;
import java.io.IOException;

// demonstrates class can have no access modifier and can be either abstract/final not both
final abstract class SyntaxCatches {

	public int id = randomId; // Cannot reference a field before it is defined
	public int randomId = id; // another field
	public int value = generateRandomValue();
	public int intValue = 10.8; // In-compatible value
	public int throwsRunTimeException = throwRunTimeException();
	public int throwsCheckedException = throwCheckedException(); // Since class has error its not complaining
	public double someVal = id + 2*Math.sqrt(value); // mixed

	public static final int si;
	public static final String str = "Hello"; // value directly added to bytecode - primitive and Strings optimized if marked final and value available during compiling
	public final int i;



	static {
		//si = 10; - black final not initialized
	}

	{
		//i = 5;
	}


	private int generateRandomValue() {
		return id; // reason why it said Cannot reference a field before it is defined
	}


	private int throwCheckedException() throws FileNotFoundException {

		if(id == 2) {
			throw new IOException();
		}
		return 0;
	}


	private int throwRunTimeException() throws NullPointerException {
		return 0;
	}

}
