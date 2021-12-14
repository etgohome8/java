package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// 배열과 for문을 이용해서 5명의 자바점수를 입력받고
		// 각 학생의 자바점수를 출력하고
		// 총 자바점수의 합과 평균을 구해보자
		
		Scanner scan = new Scanner(System.in);
		
		int[] java = new int[5];
		int sum = 0;
		double avg;
		
		// for문을 사용해서 입력받기(합구하기)
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번째 학생의 자바점수 : ");
			java[i] = scan.nextInt();
			sum += java[i];
		}
		
		// 각 학생의 점수 출력하기 (for문)
		for(int i = 0; i < java.length; i++) {
			System.out.println(i+1 + "번째 학생의 자바점수는 : " + java[i]);
		}
		
		// 합과 평균 출력하기 
		System.out.println("총 자바점수의 합 : " + sum);
		avg = sum / 5.0;
		System.out.println("자바점수 평균 : " + avg);
		scan.close();

	}

}
