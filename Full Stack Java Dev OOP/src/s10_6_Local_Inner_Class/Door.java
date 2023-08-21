package s10_6_Local_Inner_Class;

public class Door {

	// method of Door
	public boolean isLocked(String key) {

		// inner class abstract that hidden in outside class
		class Lock {

			// method in inner class
			public boolean isLocked(String key) {
				// conditional if else
				if (key.equals("qwerty")) {
					return false;
				} else {
					return true;
				}

			}

		}

		return new Lock().isLocked(key);	// sending the information in inner class

	}

}
