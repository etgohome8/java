package random;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		
		// 주사위 번호 하나를 뽑아서 출력해보자
		
		int dice = (int)(Math.random()*6)+1;
		
		System.out.println("나의 주사위 번호 : " + dice);
		
		
		
	}

}
