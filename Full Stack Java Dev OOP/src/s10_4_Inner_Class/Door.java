package s10_4_Inner_Class;

public class Door {

	private Lock lock; // custom variable

	// default constructor
	public Door() {
		lock = new Lock(true);
	}
	
	// getter method to access the object lock
	public Lock getLock() {
		return lock;
	}

	// inner class
	class Lock {

		// property
		private boolean lock;

		// constructor custom parameter
		public Lock(boolean lock) {
			this.lock = lock;
		}

		// getters and setters
		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

	}
	
	// method for status
	public void shopStatus() {
		if (lock.isLock()) {
			System.out.println("Shop is closed, please visit later.");
		} else {
			System.out.println("Welcome. We are Open.");
		}
	}

}
