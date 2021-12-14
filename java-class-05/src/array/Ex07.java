package array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 학생 3명의 이름, 국어, 영어 성적을 입력받고
		// 총점과 순위를 나타내보자
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		// 데이터 입력받기
		for(int i = 0; i < 3; i++) {
			
			System.out.print(i+1 + "번째 학생의 이름 : ");
			name[i] = scan.next();
			System.out.print(i+1 + "번째 학생의 국어점수 : ");
			kor[i] = scan.nextInt();
			System.out.print(i+1 + "번째 학생의 영어점수 : ");
			eng[i] = scan.nextInt();
			total[i] = kor[i] + eng[i];
			
		}
		
		// 순위구하기 : 우선 1등으로 초기화를 하고
		// 다른학생 성적의 총점과 내 성적의 총점을 비교해서
		// 총점이 작으면 순위를 하나 올려준다.
		// 이중 for문
		for(int i = 0; i < 3; i++) {
			
			rank[i] = 1;
			for(int j = 0; j < 3; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		// 순위순서대로 출력하기 
		
		int temp = 1;
		
		Loop1 : while(true) {
			
			for(int i = 0; i < rank.length; i++) {
				
				if(rank[i] == temp) {
					System.out.printf("%d등의 이름은 %s님이고 총점은 %d점 입니다.\n", 
							rank[i] , name[i], total[i]);
					temp++;
				}
				
				if(temp == rank.length + 1) {
					break Loop1;
				}
				
			}
			
		}
		
		scan.close();
		

	}

}








