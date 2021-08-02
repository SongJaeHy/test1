package day03.ifswitch;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		 *  롯데월드 놀이동산에 놀러 왔다.
		 *  나이에 따른 요금을 계산해서 출력한다.
		 *  
		 *  -----------------
		 *  0 - 5 : 무료
		 *  6 - 11 : 2500원
		 *  12 이상 : 5000원
		 *  -----------------
		 *  
		 *  출력형식 >
		 *  나이 : 4
		 *  무료
		 *  
		 *  나이 : 8 
		 *  2500원
		 *  
		 *  나이 : 22
		 *  5000원
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if (age <= 5) {
			System.out.println("무료");
		} else if (age <= 11) {
			System.out.println("2500원");
		} else {
			System.out.println("5000원");
		}
	}
}









