package method;

public class Ex02 {
	
	public static void hello() {
		
		int i = 0;
		while(i < 5) {
			System.out.println("안녕하세요");
			i++;
			if(i == 3) {
				return;
				// return 값이 없는 void 메소드에서
				// return을 쓰면 메소드 강제종료
			}
		}
	}

	public static void main(String[] args) {
		
		hello(); // hello 메소드 호출
		
		
	}

}
