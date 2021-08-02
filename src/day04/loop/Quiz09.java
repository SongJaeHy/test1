package day04.loop;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		/*
		 *  숫자 5개를 입력받고 입력받은 숫자의 합과 평균을 구하는 프로그램 작성
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 5;
		for (int i = 0; i < cnt; i++) {
			System.out.print("수 입력 : ");
			int num = sc.nextInt();
//			sum = sum + num;
			sum += num;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / cnt);
	}
}







