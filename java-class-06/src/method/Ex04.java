package method;

public class Ex04 {
	
	// 전원을 키는 powerOn 메소드와
	// 매개변수 2개를 받아서 더한다음 결과를 리턴해주는 
	// add(int x, int y) 메소드를 만들어보자 
	public static void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public static int add(int x, int y) {
		int result;
		result = x + y;
		return result;
	}

	public static void main(String[] args) {
		
		powerOn();
		
		int result = add(100, 200); // add() 호출 시 2개의 매개값을 준다.
		
		System.out.println("100 + 200 : " + result);
		
	}

}
