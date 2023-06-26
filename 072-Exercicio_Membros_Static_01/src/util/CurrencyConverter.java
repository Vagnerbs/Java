package util;

public class CurrencyConverter {
	
	public static double price(double price, double bought) {
		return price * bought;
	}
	
	public static double iof(double p) {
		return p + ((p / 100) * 6);
	}
}
