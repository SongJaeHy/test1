package day03.ifswitch;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		/*
		 * 화면에서 숫자를 입력 받는다.
		 * 입력받은 숫자에 해당하는 계절을 출력한다.
		 * 
		 * 12, 1, 2 -> 겨울 
		 *  3, 4, 5 -> 봄 
		 *  6, 7, 8 -> 여름 
		 *  9,10,11 -> 가을 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		switch (month) {
		case 12: 
		case 1: 
		case 2: 
			System.out.println("겨울");
			break;
		case 3: 
			System.out.println("봄");
			break;
		case 4: 
			System.out.println("봄");
			break;
		case 5: 
			System.out.println("봄");
			break;
		case 6: case 7: case 8: 
			System.out.println("여름");
			break;			
		case 9: 
		case 10: 
		case 11: 
			System.out.println("가을");
			break;			
		}
	}
}












