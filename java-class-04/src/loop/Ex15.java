package loop;

public class Ex15 {

	public static void main(String[] args) {
		// break문 
		
//		int a = 0;
//		
//		while(a < 10) {
//			System.out.println(a);
//			if(a == 7) {
//				break;
//			}
//			a++;
//		}
		
		// continue 문
		int b = 0;
		
		while(b < 10) {
			b++;
			if(b == 5) {
				continue;
			}
			System.out.println(b);
		}
		

	}

}
