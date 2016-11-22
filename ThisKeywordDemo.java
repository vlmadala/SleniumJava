
public class ThisKeywordDemo {
	public static void main(String[] args) {
		
		Car c1=new Car();
		Car c2= new Car();
		
		c1.setMake("Merc");
		System.out.println(c1.getMake());
		
		c2.setMake("BWM");
		System.out.println(c2.getMake());
	}

}
