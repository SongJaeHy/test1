package day04.loop;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 *  화면에 1부터 10까지 출력하라
		 *  단, for문을 이용하라..
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
		int val = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(val++);
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
