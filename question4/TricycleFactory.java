package question4;

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}