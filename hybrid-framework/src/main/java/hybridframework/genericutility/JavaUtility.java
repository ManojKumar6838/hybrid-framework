package hybridframework.genericutility;

import java.util.Date;

public class JavaUtility {

	public String getSystemDate() {
		String date=new Date().toString().replace(" ", "_").replace(":", "_");
		return date;
	}
	
}
