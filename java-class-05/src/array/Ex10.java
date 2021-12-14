package array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};
		
		Scanner scan = new Scanner(System.in);
		
		// 값을 입력받아 인덱스 구하기 
		System.out.println("array 배열의 값은 10, 20, 30, 40, 50 입니다.");
		System.out.print("값을 입력 : ");
		int value = scan.nextInt();
		
		int x = 0;
		
		while(x < array.length) {
			if(array[x] == value) {
				System.out.println(value + "의 인덱스는 : " + x);
			}
			x++;
		}
		scan.close();
		
	}

}



