
public class WhileDemo {

	public static void main(String[] args) {
		// Do untill the condition is true
		
		int i=10;
//	
		//boolean condition= 10<20;
//		System.out.println(condition);
		
		while(i<20){
			System.out.println(i);
			i++;
			
			if (i==17){
		//	break;  // if condition staisfies, control goes out of the loop
			continue;
			}
			//System.out.println(i);
			//i++;
			
		}
System.out.println("outside the loop");
	}

}
