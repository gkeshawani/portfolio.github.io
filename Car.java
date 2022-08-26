package firstjavaproject;

public class Car {

	int yearmodel;
	String brand;
	static int speed=0;
	
	public Car(int model,String brand,int speed) {
		
		this.yearmodel=model;
		this.brand=brand;
	
		this.speed=speed;
		System.out.println("model :"+model+" Make : "+brand+" initial speed : "+speed);	
		
	}
	
	void brake() {
		speed=speed-5;
		
	}
	
	void accelerate() {
		speed=speed+5;
		
	}

	public static void main(String[] args) {
		Car c=new Car(1965,"Bat Mobile",0);
		int i;
		for(i=0;i<=5;i++) {
			c.accelerate();
			System.out.println("current speed is after accelerate "+speed);
		}
		

		for(i=0;i<=10;i++) {
			c.brake();
			if(speed<0) {
				speed=0;
				
			}
			System.out.println("current speed is after brake "+speed);
		}
		
	}

}
