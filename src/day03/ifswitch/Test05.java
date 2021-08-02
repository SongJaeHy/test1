package day03.ifswitch;

public class Test05 {
	public static void main(String[] args) {
		/*
		 *  switch 
		 *  
		 *  : 동등 비교시 사용
		 *  
		 *  ; -> 세미콜론
		 *  : -> 콜론
		 *  
		 *  주의사항 : 
		 *  switch 블럭은 break를 만나면 switch 블럭을 빠져나간다.
		 *  
		 *  switch (수식) {
		 *  	case 값1:     
		 *  		처리문장    -> 수식과 값1 이 같은 값일 경우 
		 *  		break;
		 *  	case 값2:     
		 *  		처리문장    -> 수식과 값2 이 같은 값일 경우 
		 *  	case 값3:     
		 *  		처리문장    -> 수식과 값3 이 같은 값일 경우
		 *  	default: 
		 *  		처리문장 
		 *  }
		 */
		int v = 3;
		switch (v) {
		case 1:
			System.out.println(v + "입니다.");
			break;
		case 2:
			System.out.println(v * 2 + "입니다.");
			break;
		case 3:
			System.out.println(v * 3 + "입니다.");
			break;
		default:
			System.out.println(v * v + "입니다.");
		}
	}
}



















