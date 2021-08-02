package day02.operator;

public class Test05 {
	public static void main(String[] args) {
		/*
		 *      &&(둘다 참일 경우 참)         
		 *   T      T -> T
		 *   T      F -> F
		 *   F      T -> F
		 *   F      F -> F
		 *      ||(둘중에 하나가 참일 경우 참)         
		 *   T      T -> T
		 *   T      F -> T
		 *   F      T -> T
		 *   F      F -> F
		 * 
		 *   !T -> F
		 *   !F -> T
		 */
		int num = 10;
		System.out.println(num < 20 && num++ % 2 == 0);
		System.out.println(num);
		
		System.out.println((num == 20));
		System.out.println(!(num == 20));
	}
}








