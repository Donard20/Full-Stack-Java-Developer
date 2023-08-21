package s10_4_Inner_Class;

public class Shop {

	public static void main(String[] args) {
		
		Door door = new Door();
		door.shopStatus();
		door.getLock().setLock(false);	// use to access the inner object class to custom
		door.shopStatus();

	}

}
