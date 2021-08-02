package day04.loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 7의 배수 10개를 출력하라
		/*
		 *   7 		7 * 1
		 *   14		7 * 2
		 *   21		7 * 3
		 *   28		7 * 4
		 *   ..
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(num * i);
		}
	}
}










