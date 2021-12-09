package variable;

public class Ex09 {

	public static void main(String[] args) {
		
		// 강제 타입변환
		
		byte a = 65;
		char ch1 = (char)a;
		// char는 음수가 없는 특수자료형이기 때문에
		// 자동 타입변환 예외이다. 강제 타입변환 형식으로 해준다.
		System.out.println(ch1);
		
		int b = 128;
		byte c = (byte)b; //강제 타입변환
		// 지정된 타입보다 값이 더 클 경우 강제타입변환을 하면
		// (OverFlow) : 가장 작은값으로 돌아간다.
		System.out.println(c);
		
		float d = 3.99f;
		int e = (int)d;
		// 실수를 정수로 강제타입변환을 하면 정수부분만 저장된다.
		System.out.println(e);

	}

}
