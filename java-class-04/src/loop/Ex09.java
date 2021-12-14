package loop;

public class Ex09 {

	public static void main(String[] args) {
		
		// for문을 사용해서 구구단 2단 출력
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("2X%d=%d\n", i, 2*i);
//		}
		
		// 중첩 for문을 사용해서 구구단 2단 - 9단 출력
		
		int dan;
		int num;
		
		for(num = 1; num < 10; num++) {
			
			for(dan = 2; dan < 10; dan++) {
				System.out.printf("%dX%d=%d\t", dan, num, dan*num);
			}
			
			System.out.println();
		}
		
		
		
	}

}
