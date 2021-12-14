package array;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		int[] array = {100, 200, 300, 400, 500};
		
		// index를 입력받아 값 구하기 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("array 배열의 인덱스는 0 ~ 4 까지 입니다.");
		System.out.print("인덱스 입력 : ");
		int index = scan.nextInt();
		System.out.println("array[" + index + "] 의 값은 : " + array[index]);
		scan.close();

	}

}
