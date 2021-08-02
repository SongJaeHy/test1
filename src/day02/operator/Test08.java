package day02.operator;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		/*
		 * 사용자에게 입력 받기
		 * 
		 */
		// Scanner 
		// Scanner <- 타입
		// sc      <- 이름
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("입력된 이름 : " + name);
		System.out.println("입력된 나이 : " + age);
		
		/*
		 * nextInt() : int 정수값을 입력받겠다.
		 * next() : 문자열을 입력받겠다
		 */
		
		/*
		Test t = new Test();
		Random r = new Random();
		String s = new String();
		String s2 = "";
		*/
	}
}













