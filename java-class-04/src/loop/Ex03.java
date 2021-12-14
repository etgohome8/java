package loop;

public class Ex03 {

	public static void main(String[] args) {
		
		// for문을 이용해서 1에서 10까지의 합을 구하세요
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("1에서 10까지의 합 : " + sum);

	}

}
