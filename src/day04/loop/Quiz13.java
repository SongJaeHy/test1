package day04.loop;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 무한루프 - 반복문의 실행문장에서 반복문을 빠져나오게 해야 한다.
		while (true) {
			System.out.print("수 입력 : ");
			int num = sc.nextInt();
			System.out.println("입력한 수 : " + num);
			if (num == -1) {
				break;  // 사용자의 입력값이 -1일때 실행한다.
			}
		}
		System.out.println("반복 빠져나옴");
	}
}
