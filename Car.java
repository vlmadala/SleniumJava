
public class Car {
	private String make;
	int speed;
	int gear;
 /*
	public void setMake(String carMake) {
		make=carMake;
	}
	
	public String getMake(){
		return make;
	}*/
	
	//Use of This keyword
	
	
	public Car() {
		//Car c1=new Car();
		
		this.speed=0;
		this.gear=4;
		System.out.println("Print the Car type");
	}
	
	public Car(int speed, int gear){
		this.speed=speed;
		this.gear=gear;
		
	}
	
	public void setMake(String make){
		make=make; // this variable will call the make declred in method setMake
		this.make=make; //It referes to instance of the class,.i.e object of class
	}

	public String getMake() {
		// TODO Auto-generated method stub
		return make;
	}
	
	//Constructor
	
		// TODO Auto-generated constructor stub
	
}

