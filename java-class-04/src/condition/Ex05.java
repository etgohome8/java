package condition;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		int temp;
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		num2 = scan.nextInt();
		
		System.out.print("세번째 숫자 입력 : ");
		num3 = scan.nextInt();
		
		// 입력받은 정수 3개를 작은수부터(작은수를 num1 - num2 - num3 의 순서로)
		// 나열해보자 (temp 변수를 사용해서)
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if(num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.printf("정렬 : %d, %d, %d", num1, num2, num3);
		
		scan.close();

	}

}










