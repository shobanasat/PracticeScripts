package Example2;

enum Day{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
}

public class EnumInSwitch {
	Day day;
	
	EnumInSwitch(Day day){
		this.day = day;
	}
	
	public void dayIsLike() {
		switch(day) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;	
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;	
		case THURSDAY:
			System.out.println("Thursday");
			break;	
		case FRIDAY:
			System.out.println("Friday");
			break;	
		case SATURDAY:
			System.out.println("Saturday");
			break;	
		case SUNDAY:
			System.out.println("Sunday");
			break;	
		default:
			System.out.println("Default");
			break;
		}
	}

	public static void main(String[] args) {
		String str = "TUESDAY";
		EnumInSwitch eis = new EnumInSwitch(Day.valueOf(str));
		eis.dayIsLike();

	}

}
