package day04.loop;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		/*
		 *  1부터 입력받은 수까지의 합을 구하는 프로그램 작성
		 *  
		 *  수 입력 : -1
		 *  0보다 큰 수를 입력하세요
		 *  수 입력 : -9
		 *  0보다 큰 수를 입력하세요
		 *  수 입력 : 5
		 *  1부터 5까지의 합은 15입니다.
		 */
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		int num = -1;
		while (true) {
			// 수 입력 받는 코드
			System.out.print("수 입력 : ");
			num = sc.nextInt();
			if (num > 0) {
				break;
			}
			System.out.println("0보다 큰 수를 입력하세요");
		}
		
		// 1부터 - 입력받은 수 까지의 합을 구하는 반복문
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// 결과 출력하기
		System.out.printf(
				"1부터 %d까지의 합은 %d입니다.", num, sum
		);
	}
}









