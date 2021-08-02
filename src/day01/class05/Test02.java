package day01.class05;

public class Test02 {
	public static void main(String []args) {
//		System.out.println(i); //변수 선언전에 사용 불가능
		
		int i = 100;
		System.out.println(i); // 선언이후 사용가능
		
		i = 300;
		System.out.println(i);
		
		int k;
		// local variable : 지역변수(메서드에 선언된 변수)
		// The local variable k 
		// may not have been initialized(초기화)
		k = 100;
		System.out.println(k);
	}
}










