package quiz;

public class Ex04 {

	public static void main(String[] args) {
		// 정수 1 2 3 4 5 를 배열로 생성해보자
		// 1. new 연산자 없이 {} 이용해서 배열만들기
		// 2. new 연산자를 사용해서 {} 이용해서 배열만들기
		// 3. 초기값을 null로 준다음 배열의 길이를
		//    5로 지정하고 인덱스를 통해 배열의 각 요소에 값 입력하기(for문)
		// 4. array1은 일반 for문으로 출력 array2, array3은 향상된 for문으로 출력
		
		int[] array1 = {1, 2, 3, 4, 5};
		
		int[] array2 = new int[] {1, 2, 3, 4, 5};
		
		int[] array3 = null;
		
		array3 = new int[5];
		
		for(int i = 0; i < array3.length; i++) {
			array3[i] = i + 1;
		}
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "  ");
		}
		System.out.println();
		
		for(int i : array2) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		for(int i : array3) {
			System.out.print(i + "  ");
		}
		

	}

}
