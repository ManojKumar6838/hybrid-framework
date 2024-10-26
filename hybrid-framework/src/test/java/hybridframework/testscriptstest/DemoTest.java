package hybridframework.testscriptstest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hybridframework.baseclass.BaseClass;

@Listeners(hybridframework.listnerimplimentation.ListnerImplimentation.class)
public class DemoTest extends BaseClass{

	@Test
	public void demoTest() {
		Reporter.log("This is a Demo Test", true);
	}
}
