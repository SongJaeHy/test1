package day03.ifswitch;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 *  화면에서 점수를 입력받는다.
		 *  
		 *  입력받은 점수가 60점 이상이라면
		 *  "합격"을 출력하고
		 *  60점 미만이라면
		 *  "불합격"을 출력한다.
		 *  
		 *  출력형식>
		 *  점수 : _70
		 *  합격
		 *  
		 *  점수 : _55
		 *  불합격
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
















