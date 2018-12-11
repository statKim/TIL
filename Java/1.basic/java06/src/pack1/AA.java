package pack1;

public class AA {
	
	AA a1 = new AA(true);	// (o)
	AA a2 = new AA(1);		// (o)
	AA a3 = new AA("¹®ÀÚ¿­");	// (o)
	
	public AA(boolean b) {	}	// public
	AA(int b) {	} 				// default
	private AA(String s) {	}	// private
	
}
