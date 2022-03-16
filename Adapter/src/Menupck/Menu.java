package Menupck;

public class Menu  {
	public static void main(String[] args) {
		AdaptadorFarenheitParaCelsiusClassAdapter adptClass = new AdaptadorFarenheitParaCelsiusClassAdapter();
		System.out.println("Class: " + adptClass.Celsius());
		AdaptadorFarenheitParaCelsiusClassAdapter adptObject = new AdaptadorFarenheitParaCelsiusClassAdapter();
		System.out.println("Object: " + adptObject.Celsius());
	}
}
