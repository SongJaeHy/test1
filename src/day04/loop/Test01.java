package day04.loop;

public class Test01 {
	public static void main(String[] args) {
		// 화면에 100을 10번 출력하라
		/*
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		*/
		
		
		/*
		for ( ; ; )
			실행문장
	
		for (초기값;참 또는 거짓;조건의 영향주는 값의증감) {
			참일 경우 수행
			실행문장
			실행문장
			실행문장
		}
		
		for (1; 2; 3) {
			4
		}
		5
		
		반복문 수행시 순서
		1 -> 2(참) -> 4 -> 3
		  -> 2(참) -> 4 -> 3
		  -> 2(참) -> 4 -> 3
		  -> 2(거짓) -> 5
		
		 */
		
		/*
		 int i = 0;  - 1   i(0)
		 
		 i < 10;     - 2(참)
		 System.out.println(100);  - 4
		 i++;        - 3   i(1)
		 
		 i < 10;     - 2(참)
		 System.out.println(100);  - 4
		 i++;        - 3   i(2)
		 
		 i < 10;     - 2(참)
		 System.out.println(100);  - 4
		 i++;        - 3   i(3)
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(100);
		}
	}
}
















