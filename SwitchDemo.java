
public class SwitchDemo {

	public static void main(String[] args) {
		//Test a range of values for Variable : Switch case can be help ful
	
	int numDays=numOfDays(2000,2);
	System.out.println("No. of days in given Year and Month are" + numDays);
	}

	// How many days are there is given month and Year
	
	static int numOfDays(int year, int month){
		int numDays=0;
		
		switch(month){
		case 1:
			numDays=31;
			break;
		case 2:
			if (year%400==0){
				System.out.println(year + "is a leap year");
				numDays=29;
			}
			else{
				numDays=28;
			}
			break;
			
		
		default:
			System.out.println("Invalid Month");
			break;
		}
	return numDays;
	}
	
}
