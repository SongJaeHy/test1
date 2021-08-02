package day04.loop;

public class Quiz12 {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		/*
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		*/
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				evenSum += i;
				continue;
			}
			
			oddSum += i;
		}
		
		System.out.println("Â¦¼ö ÇÕ : " + evenSum);
		System.out.println("È¦¼ö ÇÕ : " + oddSum);
		System.out.println("ÀüÃ¼ ÇÕ : " + (evenSum + oddSum));
	}
}







