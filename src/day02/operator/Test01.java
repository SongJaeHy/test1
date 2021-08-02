package day02.operator;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * System.out.println("Hello World");
		 */
		
		/*
		 * 산술연산자
		 * : +, -, *(곱하기), /(몫), %(나머지)
		 * 
		 * 데이터타입 : int(정수), char(아스키코드), String(+)
		 * "1" + "2" -> "12"
		 */
		
		System.out.println(100 + 200);
		// 실수(소수점을 포함하는 숫자) : float, double(기본)
		// 1.1 - double, 1.1f or 1.1F - float
		// 숫자d, 숫자D -> double
		// 100 - int / 100 - int
		// int 산술연산자 int -> 결과는 int
		// int 산술연산자 double -> 결과는 double
		// double 산술연산자 int -> 결과는 double
		System.out.println(100 + 200);
		System.out.println(100 - 200);
		System.out.println(100 * 200);
		System.out.println(100 / 200);
		System.out.println(100 / 200d);
		System.out.println(100 / 200.0);
		System.out.println(100.0 / 200);
		System.out.println(100 % 200);
		System.out.println(75 % 2);  // 1
		System.out.println(100 % 2);  // 0
		System.out.println(999 % 2);  // 1
	}
}












