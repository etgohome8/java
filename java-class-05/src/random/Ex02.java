package random;

public class Ex02 {

	public static void main(String[] args) {
		// 로또 추첨하기
		// 정수 1 ~ 45 중에서 6개를 뽑기
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45) + 1;
			
			for(int j = 0; j < i; j++) { // j는 i의 아랫수까지 반복
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		
	}

}
