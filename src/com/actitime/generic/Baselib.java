package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baselib {
@BeforeMethod
@Parameters
public void precond(String browserNmae, String url) {
	driver=BrowserFactory.LaunchBrowser(browsername, url);
	Reporter.log("browser launched", true);
}

@AfterMethod
public void postCond() {
	Object driver;
	driver.close();
	
	if(driver!=null) {
		driver.quit();
	}
	Reporter.log("browser closed", true);
	}
}




}
