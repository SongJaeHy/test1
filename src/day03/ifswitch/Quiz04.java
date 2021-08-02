package day03.ifswitch;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		 * 화면에서 숫자를 하나 입력받는다.
		 * 입력받은 숫자의 절대값을 출력한다.
		 * 
		 * 숫자 : _7
		 * 절대값 : 7
		 * 
		 * 숫자 : _-7
		 * 절대값 : 7
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println("절대값 : " + num);
		} else {
			System.out.println("절대값 : " + num * -1);
		}
	}
}









