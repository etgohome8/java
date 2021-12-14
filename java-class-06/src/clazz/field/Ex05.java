package clazz.field;

class Car3 {
	
	private int speed; // 필드를 바로 접근 불가능
	// private 은 외부접근 허용안됨 // 데이터보호를 위해 사용

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			return;
		}else {
			this.speed = speed;
		}
	}
	
}



public class Ex05 {

	public static void main(String[] args) {
		
		Car3 car = new Car3();
		
		//car.speed = 100;
		
		car.setSpeed(100);
		
		System.out.println("자동차 속도는 : " + car.getSpeed());
	}

}
