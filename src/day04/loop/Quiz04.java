/*
 * 1  2  3  4 ... 10
 * 11 12 13  ...  20
 * ...
 * ...
 * 91 92 93  ..   100
 */
package day04.loop;
public class Quiz04 {
	public static void main(String[] args) {
		for (int cnt = 0; cnt < 10; cnt++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + cnt * 10 + " ");
			}
			System.out.println();
		}
		
		/*
		// 1- 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + 0 + " ");
		}
		System.out.println();
		// 11 - 20
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + 10 + " ");
		}
		System.out.println();

		// 21 - 30
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + 20 + " ");
		}
		System.out.println();
		
		// 91 - 100
		*/
		
		/*
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if (i % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}

		for (int i = 1; i <= 100; i++) {
			// %d : 정수, %s : 문자열, %f : 실수, %c : 문자
			System.out.printf(
				"%3d%s", i, i % 10 == 0 ? "\n" : " "
			);
		}
		*/
	}
}







