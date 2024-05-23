package hybridframework.genericutility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Manoj Kumar M
 */
public class JavaUtility {

	public String getSystemDate() {
		String date=new Date().toString().replace(" ", "_").replace(":", "_");
		return date;
	}
		
	public String getSystemDateinDD_MM_YYYY_Format() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		String actualDate = sdf.format(date);
		return actualDate;
	}
	
	public int getRandomNumber(int range) {
		Random ran=new Random();
		int num = ran.nextInt(range);
		return num;
	}
}
