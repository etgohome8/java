package array;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// 정수 5개를 입력받아
		// 입력받은 정수 중에서 3의 배수만 출력해보기
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[5];
		
		
		// 입력받기
		for(int i = 0; i < array.length; i++) {
			System.out.print(i+1 + "번째 정수를 입력 : ");
			array[i] = scan.nextInt();
		}
		
		
		// 입력받은 정수 중에서 3의배수만 출력하기
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0) {
				System.out.println(array[i]);
			}
		}
		
		scan.close();

	}

}
