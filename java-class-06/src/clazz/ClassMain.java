package clazz;


class Person { // 설계도
	// 클래스 안에 구성멤버는
	// 필드, 생성자, 메소드
	
	// 필드 (속성)
	// (class에 선언된 변수를 필드라고 한다.)
	String name;
	int age;
	
	public Person() {} // 생성자
	
	// 메소드(기능)
	public void walk() {}
	public void run() {}
	
}


public class ClassMain {

	public static void main(String[] args) {
		
		Person object = new Person();
		// 클래스(타입) 변수 = new 생성자;
		// Person 클래스(설계도)를 쓰기위한 객체를 생성
		
	}

}
