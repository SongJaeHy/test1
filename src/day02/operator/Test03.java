package day02.operator;

public class Test03 {
	public static void main(String[] args) {
		/*
		 *  증감연산자
		 *  : 변수의 값을 1 증가 또는 1 감소 시킨다.
		 *  : ++, --
		 */
		int a = 5;
//		a = a + 1;  // a = 5 + 1;  a = 6;
		a++;  // 6
		System.out.println(a);
		
		++a;  // 7, 1증가 a = a + 1;
		System.out.println(a);
		
		--a;  // 6
		a--;  // 5
		System.out.println(a);
	}
}










