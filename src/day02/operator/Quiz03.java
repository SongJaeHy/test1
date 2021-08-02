package day02.operator;

public class Quiz03 {
	public static void main(String[] args) {
		String name = "아이유";
		int age = 29;
		// 올해 마지막 20대인 29살 아이유는 5억을 기부
		// + 연산자를 이용해서 출력 : println
		System.out.println(
		    "올해 마지막 20대인 " + age + "살 " + 
		    name + "는 5억을 기부"
		);
		System.out.printf(
			"올해 마지막 20대인 %d살 %s는 5억을 기부%n",
			age, name
		);
	}
}









