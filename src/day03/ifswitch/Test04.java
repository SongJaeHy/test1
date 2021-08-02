package day03.ifswitch;

public class Test04 {
	public static void main(String[] args) {
		int a = 10;
		System.out.printf("--%d--\n", a);
		System.out.printf("--%5d--\n", a);
		System.out.printf("--%-5d--\n", a);
		
		for (int dan = 2; dan <= 3; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.print(dan + " * " + i + " = " + dan * i + " ");
			}
			System.out.println();
		}
	}
}
