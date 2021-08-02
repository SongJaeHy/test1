package day03.ifswitch;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		/*
		 *   if 조건 제어문 
		 *   
		 *   if(참 또는 거짓)
		 *      참일경우 실행할 문장
		 *      
		 *   if(참 또는 거짓) {
		 *   	참일경우 실행할 문장
		 *   	참일경우 실행할 문장
		 *   	참일경우 실행할 문장
		 *   	참일경우 실행할 문장
		 *   }
		 */
		// 나이를 입력받아서 입력받은 나이가
		// 18 이상 일 경우
		// "투표 가능한 나이입니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		
		int age = sc.nextInt();
		/*
		if (age >= 18) 
			System.out.println("투표 가능한 나이입니다");
		*/
		if (age >= 18) {
			System.out.println("당신의 나이는 " + age);
			System.out.println("투표 가능한 나이입니다");
		}
		System.out.println("프로그램 종료");
	}
}












