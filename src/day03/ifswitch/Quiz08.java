package day03.ifswitch;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		/*
		 * 세개의 서로다른 숫자를 입력받는다.(양수)
		 * 
		 * 입력받은 수 중에서 가장 큰값을 출력하시오
		 * 
		 * 출력형식 >
		 * 숫자1 : 10
		 * 숫자2 : 50
		 * 숫자3 : 7
		 * 
		 * 최댓값 : 50
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		System.out.print("숫자3 : ");
		int n3 = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		if (max < n1) max = n1;
		if (max < n2) max = n2;
		if (max < n3) max = n3;
		System.out.println("최댓값 : " + max);
	}
}











