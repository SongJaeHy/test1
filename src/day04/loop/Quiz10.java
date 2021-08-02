package day04.loop;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		/*
		 * 	임의의 양수 2개를 입력받는다
		 *  단, 같은 숫자는 입력되지 않는다.
		 *  
		 *  수 입력 : 3
		 *  수 입력 : 10
		 *  합은 6입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int start = sc.nextInt();
		System.out.print("수 입력 : ");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}






