package array;

public class Ex13 {

	public static void main(String[] args) {
		
		int[] engScores = new int[] {70, 65, 80, 90, 85};
		
		// 5명의 영어점수를 향상된 for문으로 출력
		for(int eng : engScores) {
			System.out.print(eng + "  ");
		}
		System.out.println();
		
		// 학생이 2명 더 늘어났다면...
		int[] newEngScores = new int[7];
		
		// for문을 이용해서 이전배열로부터 항목값들을 복사
		for(int i = 0; i < engScores.length; i++) {
			newEngScores[i] = engScores[i];
		}
		
		for(int eng : newEngScores) {
			System.out.print(eng + "  ");
		}
		
		

	}

}
