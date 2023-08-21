package s10_3_Multiple_Inheritance;

public abstract class Person implements IsAlive, LiveLife {
	
	// method
	public void speak() {
		System.out.println("Share his/her thoughts.");
	}
	
	// method
	public abstract void eat();
	
	// method from IsAlive class
	public	void breathe() {
		System.out.println("be alive, remain living.");
	}
	
	// method from LiveLife class
	public void message() {
		System.out.println("life is a journey , keep moving and meet new people.");
	}
	

}
