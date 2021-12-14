package quiz;

public class Ex01 {

	public static void main(String[] args) {
		// 다음의 글을 String 변수에 담고 출력해보자
		
		// "이몽룡"과 "성춘향"은
		// 사랑하는 사이다.
		
		String str = "\"이몽룡\"과 \"성춘향\"은\n사랑하는 사이다.";
		System.out.println(str);
		
		// 정수 65를 byte 변수에 담아서 아스키문자로 출력해보자
		byte ascii = 65;
		System.out.println((char)ascii);
		
		
		
		int x = 0;
		int add = 0;
		
		while(x < 10) {
			add += ++x;
		}
		
		// 다음 while문에서 한줄코드로만 작성해서
		// 1부터 10까지 숫자를 더하는 식을 완성해보자
		System.out.println(add);
		
		
		
		

	}

}
