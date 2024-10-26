package hybridframework.testscriptstest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hybridframework.baseclass.BaseClass;

@Listeners(hybridframework.listnerimplimentation.ListnerImplimentation.class)
public class Demo2Test extends BaseClass{
	
	@Test
	public void demoTest() {
		Reporter.log("This is a Demo 2 Test", true);
	}

}
