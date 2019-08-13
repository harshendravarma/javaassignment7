package question2;

public class Main {
	static void m1(Interface1 i) {}
	static void m2(Interface2 i) {}
	static void m3(Interface3 i) {}
	static void m4(NewInterface i) {}

	public static void main(String[] args) {
	     ChildClass c=new ChildClass();
	     m1(c);
	     m2(c);
	     m3(c);
	     m4(c);

	}

}
