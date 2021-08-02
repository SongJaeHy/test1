package day04.loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		Random r = new Random();
		int answer = r.nextInt(1000) + 1; // 1 ~ 1000
		System.out.println("정답 : " + answer);
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		for (; i <= 10; i++) {
			System.out.print(i + ". 수를 입력하세요(1 - 1000) : ");
			int input = sc.nextInt();
			if (input == answer) {
				System.out.println("정답입니다.");
				break;
			}
			/*
			if (input > answer) {
				System.out.println("오답입니다.(작은 수입니다.)");				
			} else {
				System.out.println("오답입니다.(큰 수입니다.)");				
			}
			*/
			System.out.printf(
				"오답입니다.(%s 수입니다.)\n", 
				input > answer ? "작은" : "큰"
			);
		}
		if (i == 11) {
			// 정답을 못 맞췄을 경우 10회안에 맞추기 게임에 실패하였습니다.
			System.out.println("10회안에 맞추기 게임에 실패하였습니다.");
			System.out.printf("정답은 %d 입니다.", answer);
		}
		
		/*
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;
			System.out.print(num + " ");
		}
		*/
	}
}
