package s10_8_anonymous_inner_class;

//Abstract class representing a lock
abstract class Lock {

	// Abstract method to check if the lock is unlocked
	public abstract boolean isUnlocked(String keyCode);

	// Method for testing
	public void test() {
		System.out.println("test");
	}
}

//Class representing a door
public class Door {

	// Creating an instance of an anonymous inner class extending Lock
	private Lock lock = new Lock() {

		@Override
		public boolean isUnlocked(String keyCode) {
			if (keyCode.equals("qwerty")) {
				return true;
			} else {
				return false;
			}

		}
	};	// End of anonymous inner class definition

	// Method to get the lock instance
	public Lock getLock() {
		return lock;
	}
	
	
	
	
}
