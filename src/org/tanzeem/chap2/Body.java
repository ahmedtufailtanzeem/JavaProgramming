package org.tanzeem.chap2;

public class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;

	private static long nextID = 0;

	// The default constructor has the same accessibility as the class for which it
	// was defined—if the class is public then the default constructor is public.
	Body() { // constructors are not members of a class—a distinction you can usually ignore,
				// except when it comes to inheritance
				// and can have all access modifiers similar to members
		idNum = nextID++;
	}

	Body(String bodyName, Body orbitsAround) {
		// this(orbits); // can not invoke methods/fields of current object since this
		// is not yet ready ???
		this(); // first statement in the constructor
		name = bodyName;
		orbits = orbitsAround;
	}

	public static void main(String[] args) {
		Body sun = new Body("Sol", null);
		Body earth = new Body("Earth", sun);
	}

	Body(String bodyName) {
		this(bodyName, null);
	}

	Body(Body other) {
	    idNum = other.idNum;
	    name = other.name;
	    orbits = other.orbits;
	}

}
