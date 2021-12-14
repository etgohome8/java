package clazz.array;

import java.util.Scanner;

// People 클래스를 만든다.
// 필드는 String name; int age; 이다.
// 생성자의 매개값으로 name과 age를 초기화하자

class People {
	
	String name; 
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		
		// Scanner로 사람수(peopleCount)를 입력받아 클래스배열을 만들고
		// 이름과 나이를 입력받아(for문) 배열의 각 요소에 저장 후 반복문으로 출력해보자 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람수를 입력 : ");
		int peopleCount = scan.nextInt();
		
		People[] pp = new People[peopleCount];
		
		for(int i = 0; i < pp.length; i++) {
			
			System.out.print(i+1 + "번째 사람의 이름 : ");
			String name = scan.next();
			System.out.print(i+1 + "번째 사람의 나이 : ");
			int age = scan.nextInt();
			
			pp[i] = new People(name, age);
		}
		
		for(int i = 0; i < peopleCount; i++) {
			
			System.out.println(i+1 + "번째 사람의 이름은 : " + pp[i].name);
			System.out.println(i+1 + "번째 사람의 나이는 : " + pp[i].age);
			
		}
		
		scan.close();
		
		
		
	}

}
