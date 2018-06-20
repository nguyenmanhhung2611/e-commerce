package utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

	public static Timestamp getTimestampByString(String time) {
		Timestamp timestamp = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(Constant.FORMAT_DATETIME);
			Date parsedTimeStamp = dateFormat.parse(time);
		    timestamp = new Timestamp(parsedTimeStamp.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    return timestamp;
	}
	
}
