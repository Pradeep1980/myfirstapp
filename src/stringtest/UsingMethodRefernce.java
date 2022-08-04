package stringtest;


public class UsingMethodRefernce {
	
	public static void getUsing() {
		System.out.println("some defination...");
	}

	public static void main(String[] args) {
		
		
		newFeatures  features= UsingMethodRefernce::getUsing;
		features.say();
	}
}
