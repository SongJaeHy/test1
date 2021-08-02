/*
 * 반복문 빠져나오기(나머지 반복처리 구문을 스킵해)
 * break
 * 
 * 현재 진행중인 반복처리 구문을 스킵해
 * continue
 * 
 * switch(수식) {
 *    case 값1:
 *       실행문장;
 *       break;
 * }
 */
package day04.loop;

public class Test03 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i == 5) {  // i가 5 .. 
				break;
			}
			System.out.println(i);
		}
		System.out.println("break 반복 빠져나옴");
		
		for (int i = 1; i < 11; i++) {
			if (i == 5) {  // i가 5 .. 
				continue;
			}
			System.out.println(i);
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
		}
		System.out.println("continue 반복 빠져나옴");
		
	}
}






