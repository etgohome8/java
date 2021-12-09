package print;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.print("print()는 ()안에 내용출력후 줄바꿈X");
		System.out.println();
		// 이렇게만 썼을경우 줄바꿈만 한다.
		System.out.println("println()은 ()안에 내용출력 후 줄바꿈O");
		
		System.out.printf("좋은하루 되세요~!");
		System.out.printf("\n"); //줄바꿈
		System.out.printf("이름 : %s", "홍길동"); // %s : 문자열
		System.out.printf("\n");
		
		System.out.printf("나이 : %d", 20); // %d : 정수
		

	}

}
