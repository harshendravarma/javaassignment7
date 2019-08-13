package question1;

class Mouse extends Rodent {
	Mouse() {
		System.out.println("I am a Mouse derived from rodent");
	}

	void eat() {
		System.out.println("Mouse is eating");
	}

	void run() {
		System.out.println("Mouse is running");
	}
}