package stringtest;

public class Airtel implements TestDefaultInterface{
	
	public void fiveGConnection() {
		System.out.println("We are launched");
	}

	public static void main(String[] args) {
		
	                 
		     TestDefaultInterface test = new Airtel();
		     test.fiveGConnection();
		
	}
}
