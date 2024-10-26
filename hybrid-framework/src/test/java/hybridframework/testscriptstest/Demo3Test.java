package hybridframework.testscriptstest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hybridframework.baseclass.BaseClass;

@Listeners(hybridframework.listnerimplimentation.ListnerImplimentation.class)
public class Demo3Test extends BaseClass{

	@Test
	public void demo3Test() {
		Reporter.log("This is a Demo 3 Test", true);
	}
}
