package operation;

public class Ex03 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 100;
		b = a + 100;
		c = b + 200;
		
		System.out.printf("a, b, c의 값 : %d, %d, %d\n", a, b, c);
		System.out.println();
		
		a = b = c = 100;
		// 오른쪽의 값을 왼쪽변수에 저장(대입연산자)
		System.out.printf("a, b, c의 값 : %d, %d, %d\n\n", a, b, c);
		
		// 복합 대입연산자
		a += 100; // a = a + 100; // a > 200
		b -= 100; // b = b - 100; // b > 0
		c *= 100; // c = c * 100; // c > 10000
		
		System.out.printf("a, b, c의 값 : %d, %d, %d\n\n", a, b, c);
		
		a = b = 10;
		System.out.printf("a, b의 값 : %d, %d\n", a, b);
		a /= 5; // a = a / 5; // a > 2
		b %= 3; // b = b % 3; // b > 1
		System.out.printf("a, b의 값 : %d, %d\n", a, b);

	}

}







