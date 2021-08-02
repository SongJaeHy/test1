/*
 *    1부터 10사이의 숫자를 출력한다.
 *    3의 배수는 그대로 출력하고
 *    3의 배수가 아닌 숫자는 2배수를 출력한다.
 *    
 *    출력형식>
 *    2
 *    4
 *    3
 *    8
 *    10
 *    6
 *    ..
 *    ..
 *    20
 */
package day04.loop;

public class Quiz08 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			/*
			if (i % 3 == 0) {
				System.out.println(i);
			} else {
				System.out.println(i * 2);
			}
			*/
			System.out.printf(
					"%d\n", i % 3 == 0 ? i : i * 2
			);
		}
	}
}












