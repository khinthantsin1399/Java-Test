package ojt;

/**
 * <h2> SwitchExample Class</h2>
 * <p>
 * Process for Displaying SwitchExample
 * </p>
 * @author khinthantsin
 */
public class SwitchExample {
	/**
	 * <h2> Days Class</h2>
	 * <p>
	 * Process for Displaying Days
	 * </p>
	 * @author khinthantsin
	 */
	enum Days {
	    MON,
	    TUE,
	    WED,
	    THUR,
	    FRI
	}
	/**
	 * <h2> main</h2>
	 * <p>
	 * main method
	 * </p>
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (Days days : Days.values()) { 
			if(days==Days.THUR) {
				continue;
			}
		    System.out.println(days); 
		}
		Days day;
		day = Days.THUR;
		switch (day) {
        case MON:
            System.out.println("\nToday is Monday.");
            break;
        case TUE:
            System.out.println("\nToday is Tuesday.");
            break;
        case WED:
            System.out.println("\nToday is Wednesday.");
            break;
        case THUR:
            System.out.println("\nToday is Thursday.");
            break;
        case FRI:
            System.out.println("\nToday is Friday.");
            break;
    }	
		
}
}
