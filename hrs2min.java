import java.util.*;


public class hrs2mins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time1 = "05:00 AM";
		String time2 = "06:20 AM";

		String format = "HH:mm aa";

		SimpleDateFormat sdf = new SimpleDateFormat ( format );

		Date dateObj1 = null;
		Date dateObj2 = null;
		try {
		    dateObj1 = sdf.parse ( time1 );
		    dateObj2 = sdf.parse ( time2 );
		} catch ( ParseException e ) {
		    e.printStackTrace ( );
		}

		long diff = dateObj2.getTime ( ) - dateObj1.getTime ( );
		double diffInHours = diff / ( ( double ) 1000 * 60 * 60 );
		double diffInMins = ( diffInHours + ( int ) diffInHours ) * 60;
		
		System.out.println ( "diff: " + diff );
		System.out.println ( "diffInHours: " + diffInHours );
		System.out.println ( "diffInMins " + diffInMins );

	}

}
