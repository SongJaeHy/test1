package day02.operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		int time = sc.nextInt();
		// 출력결과
		// 7451초는 ??시간 ??분 ??초 입니다.
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = time % 60;
		System.out.printf(
				"%d초는 %d시간 %d분 %d초 입니다.",
				time, hour, minute, second
		);
	}
}
