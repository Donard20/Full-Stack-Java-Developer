package s10_1_Interfaces;

public class Iphone8 implements Phone{
	
	/*by implementing the methods in Phone Class it can import in 
	 * this class by overriding it
	 * */
	

	@Override
	public String processor() {
		
		return "A11";
	}

	@Override
	public String OS() {
		
		return "IOS";
	}

	@Override
	public int spaceInGB() {
		
		return 64;
	}

}
