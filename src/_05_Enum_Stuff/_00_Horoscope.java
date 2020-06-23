package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void display(Zodiac z) {
		switch(z) {
		case ARIES: 
			System.out.println("aries");
			break;
		case TAURUS: 
			System.out.println("taurus");
			break;
		case GEMINI: 
			System.out.println("gemini");
			break;
		case CANCER: 
			System.out.println("cancer");
			break;
		case LEO:
			System.out.println("leo");
			break;
		case VIRGO:
			System.out.println("virgo");
			break;
		case LIBRA:
			System.out.println("libra");
			break;
		case SCORPIO: 
			System.out.println("scorpio");
			break;
		case SAGITTARIUS:
			System.out.println("SAGITTARIUS");
			break;
		case CAPRICORN:
			System.out.println("CAPRICORN");
			break;
		case AQUARIUS:
			System.out.println("AQUARIUS");
			break;
		case PISCES:
			System.out.println("PISCES");
			break;
		}
		
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		display(Zodiac.VIRGO);
	}
}
