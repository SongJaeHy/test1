/*
 *  사용자가 -1을 입력할 때 까지 입력받은 수의 합을 구한다
 *  단, -1은 합에 넣지 않는다.
 *  
 *  수 입력 : 10
 *  수 입력 : 5
 *  수 입력 : -1
 *  
 *  수의 합은 15 입니다.
 */
package day04.loop;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;  // sum += num;
		while(true) {
			System.out.print("수 입력 : ");
			int num = sc.nextInt();
			// 1 sum += num;
			
			if (num == -1) {
				break;
			}
			
			// 2 sum += num;
			sum += num;
		}
		System.out.println("수의 합은 " + sum + " 입니다.");
	}
}











