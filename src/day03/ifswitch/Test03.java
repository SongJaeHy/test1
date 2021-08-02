package day03.ifswitch;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * if (참 또는 거짓) {
		 *    참일 경우
		 * } else if (참 또는 거짓) {
		 * 	  참일 경우
		 * } else if (참 또는 거짓) {
		 *    참일 경우
		 * } else {
		 *    위의 경우가 모두 아닌 경우
		 * }
		 */
		/*
		 * 숫자를 입력받고 
		 * 입력받은 숫자가 5일 경우
		 * 5입니다 
		 * 
		 * 숫자가 5보다 큰 경우
		 * 5보다 큽니다.
		 * 
		 * 숫자가 5보다 작은 경우
		 * 5보다 작습니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		/*
		if (num == 5) {
			System.out.println("5입니다.");
		}
		if (num > 5) {
			System.out.println("5보다 큽니다.");
		}
		if (num < 5) {
			System.out.println("5보다 작습니다.");
		}
		*/
		if (num == 5) {
			System.out.println("5입니다.");
		} else if (num > 5) {
			System.out.println("5보다 큽니다.");
		} else {
			System.out.println("5보다 작습니다.");
		}
	}
}













