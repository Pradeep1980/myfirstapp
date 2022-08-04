package basicprogramme;

public class ToCheck {

	public static void getA(Object o) {
		System.out.println("object");

	}

	public static void getA(String s) {
		System.out.println("string");

	}

	public static void main(String[] args) {

		ToCheck.getA(null);

	}

}
