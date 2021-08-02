package day03.ifswitch;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 전자제품 대리점에 갔다.
		 * 
		 * 물건값에 따라서 할인을 진행하고 있다.
		 * 
		 * --------------------------
		 * 물건값   10만원 이하   30만원 이하  30만원 초과 
		 * 할인율   3% 할인      5% 할인     8% 할인
		 * --------------------------
		 * 
		 * 출력형식>
		 * 
		 * 물건값(만원) : 10
		 * 계산금액은 97000원 입니다.
		 * 
		 * 물건값(만원) : 20
		 * 계산금액은 190000원 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값(만원) : ");
		int price = sc.nextInt();
		double rate = 0;
		if (price <= 10) {  // 10만원 이하
			rate = 0.97;
		} else if (price <= 30) {  // 30만원 이하
			rate = 0.95;
		} else {  // 30만원 초과
			rate = 0.92;
		}
		System.out.println(
			"계산금액은 " + 
			(int)(price * 10000 * rate) + 
			"원 입니다."
		);
		/*
		System.out.printf(
			"계산금액은 %d원 입니다.", (int)(price * 10000 * rate)
		);
		*/
		
		// %d 정수, %f 실수, %s 문자열, %c 문자
		System.out.printf(
			"계산금액은 %.2f원 입니다.", price * 10000 * rate
		);
	}
}










