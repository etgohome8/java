package random;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 로또 게임 (내가 1 ~ 45까지의 정수를 6개 입력받기)
		// 로또 추첨을 한 6개의 수와 비교
		// 몇개나 맞추었는지 알려주기
		
		Scanner scan = new Scanner(System.in);
		
		int lotto[] = new int[6];
		int myLotto[] = new int[6];
		int count = 0;
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			for(int j = 0; j < i; j++) { 
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 내가 1 ~ 45까지의 정수를 6개 입력받기 (중복수X)
		for(int i = 0; i < myLotto.length; i++) {
			
			System.out.print(i+1 + "번째 로또번호를 입력 : ");
			myLotto[i] = scan.nextInt();
			
			if(myLotto[i] < 1 || myLotto[i] > 45) {
				System.out.println("1에서 45사이의 정수를 입력해주세요");
				i--;
				continue;
			}
			
			for(int j = 0; j < i; j++) {
				if(myLotto[i] == myLotto[j]) {
					System.out.println("같은 번호를 입력할 수 없습니다.");
					i--;
					break;
				}
			}
		}
		
		// 몇개나 맞추었는지 알아보기
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(myLotto[i] == lotto[j]) {
					count++;
				}
			}
		}
		
		System.out.printf("이번주 로또 숫자는 %d, %d, %d, %d, %d, %d 입니다.\n",
				lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
		
		System.out.println(count + "개를 맞추셨습니다.");
		scan.close();

	}

}
