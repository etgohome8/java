package loop;

public class Ex05 {

	public static void main(String[] args) {
		
		// 500 에서 1000 까지의 홀수의 합을 구하세요
		
		int sum = 0;
		
		for(int i = 501; i <= 1000; i += 2) {
			sum = sum + i;
		}
		
		System.out.println("500에서 1000까지의 홀수의 합 : " + sum);

	}

}
