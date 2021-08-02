package day03.ifswitch;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 *   당신의 가족 구성원수를 입력하세요
		 *   입력받은 가족 구성원의 수가 5명 이상일 경우
		 *   "대가족 입니다"를 출력
		 *   
		 *   프로그램 종료 출력 - 조건에 상관없이 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 가족 구성원수를 입력하세요 : ");
		int count = sc.nextInt();
		if (count >= 5) {
			System.out.println("대가족 입니다");
		}
		System.out.println("프로그램 종료");
	}
}







