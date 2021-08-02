package day04.loop;

public class Test04 {
	public static void main(String[] args) {
		/*
		 *    1 - 2 - 4 - 3
		 *    
		 *    for (1 ; 2 참 or 거짓 ; 3) {
		 *    	  4 참일 경우 실행
		 * 	  }
		 * 
		 *    1
		 *    while (2 참 or 거짓) {
		 *    
		 *        4 참일경우 실행
		 *        
		 *        3
		 *    }
		 */
		for (int i = 1; i < 11; i++) {
			System.out.println("for : " + i);
		}
		
		int i = 1;
		while (i < 11) {
			System.out.println("while : " + i);
			i++;
		}
	}
}











