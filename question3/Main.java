package question3;

public class Main {

	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[] { new Cycle(), new Unicycle(), new Bicycle(), new Tricycle() };
		for (Cycle c : cycles) {
			/*
			 * Exception in thread "main" java.lang.ClassCastException: class
			 * assignment2.Cycle cannot be cast to class assignment2.Unicycle
			 * (assignment2.Cycle and assignment2.Unicycle are in module assignment2 of
			 * loader 'app') at assignment2/assignment2.Main.main(Main.java:93)
			 */
			// c.balance();
			((Unicycle) c).balance();
		}
	}

}
