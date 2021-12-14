package clazz.field;

class Car2 {
	
	String color;
	int speed;
	
	public void setSpeed(int speed) { // set : 저장하다
		this.speed = speed;
	}
	
	public int getSpeed() { // get : 가져오다
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		
		Car2 car = new Car2();
		
		// 필드로 바로접근
		car.color = "빨강";
		car.speed = -100;
		
		System.out.println("색상은 : " + car.color);
		System.out.println("속도는 : " + car.speed);
		System.out.println();
		
		// 메소드로 접근
		car.setColor("파랑");
		car.setSpeed(-120);
		
		System.out.println("색상은 : " + car.getColor());
		System.out.println("속도는 : " + car.getSpeed());
		
	}

}
