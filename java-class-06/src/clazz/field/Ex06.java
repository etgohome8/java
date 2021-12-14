package clazz.field;

// Person 클래스를 만든다.
// 필드는 String name; int age; String number; 이다.
// 필드를 외부접근 금지가 되게하고 getter setter 메소드를 통해서 필드를 접근하게 한다.
// 나이를 기본 성인나이 20살부터 100살로만 초기화할 수 있게 setAge 메소드를 수정한다.

class Person {
	
	private String name; 
	private int age; 
	private String number;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 20 || age > 100) {
			System.out.println("나이는 20살부터 100살까지 입니다.");
			System.out.println("기본 성인나이 20살로 초기화합니다.");
			this.age = 20;
		}else {
			this.age = age;
		}
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
}


public class Ex06 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("홍길동");
		person.setAge(10);
		person.setNumber("010-1111-2222");
		
		System.out.println("이름은 : " + person.getName());
		System.out.println("나이는 : " + person.getAge());
		System.out.println("전화번호는 : " + person.getNumber());
		
	}

}
