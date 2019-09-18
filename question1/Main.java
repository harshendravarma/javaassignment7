package question1;

public class Main {
	public static void main(String[] args) {
		
		Rodent r[] = new Rodent[3];
		
		r[0] = new Mouse();		//output: I am a Mouse derived from rodent,I am a Rodent
		r[1] = new Gerbil();	//output: I am a Gerbil derived from rodent,I am a Rodent
		r[2] = new Hamster();	//output: I am a Hamster derived from rodent,Mouse is eating

		r[0].eat();		//output: Mouse is eating
		r[0].run();		//output: Mouse is eating

		r[1].eat();		//output: Gerbil is eating
		r[1].run();		//output: Gerbil is running

		r[2].eat();		//output: Hamster is eating
		r[2].run();		//output: Hamster is running
	}
}
