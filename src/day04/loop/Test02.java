package day04.loop;

public class Test02 {
	public static void main(String[] args) {
		int a = 9;
		if (a % 2 == 0) {
			System.out.println("Â¦¼ö");
		} else {
			System.out.println("È¦¼ö");
		}
		
		// Á¶°Ç ¿¬»êÀÚ( Á¶°Ç½Ä ? °ª1 : °ª2 )
		String result = (a % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";
		System.out.println(result);
		
		
		System.out.println((a % 2 == 0) ? "Â¦¼ö" : "È¦¼ö");
	}
}














