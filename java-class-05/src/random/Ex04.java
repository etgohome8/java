package random;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 주사위게임
		
		Scanner scan = new Scanner(System.in);
		
		boolean bool = true;
		
		while(bool) {
			
			System.out.println("내 주사위를 굴릴까요?");
			System.out.println("YES(1) NO(2)");
			int yes1 = scan.nextInt();
			
			if(yes1 != 1) {
				System.exit(0); // 시스템 강제종료
			}
			
			int myDice = (int)(Math.random() * 6) + 1;
			// 1 ~ 6 까지 숫자 중 하나를 뽑는다.
			System.out.println("나의 주사위 숫자는 : " + myDice);
			
			System.out.println("상대방 주사위를 굴릴까요?");
			System.out.println("YES(1) NO(2)");
			int yes2 = scan.nextInt();
			
			if(yes2 != 1) {
				System.exit(0); 
			}
			
			int comDice = (int)(Math.random() * 6) + 1;
			System.out.println("상대방 주사위 숫자는 : " + comDice);
			
			if(myDice > comDice) {
				System.out.println("---------------");
				System.out.println("!! 승리했습니다 !!");
				System.out.println("---------------");
			}else if(myDice == comDice) {
				System.out.println("---------------");
				System.out.println("!! 비겼습니다 !!");
				System.out.println("---------------");
			}else {
				System.out.println("---------------");
				System.out.println("!! 졌습니다 !!");
				System.out.println("---------------");
			}
			
		}
		
		scan.close();
		

	}

}










