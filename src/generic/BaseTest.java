package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


@Listeners(Result.class)
public abstract class BaseTest implements IAutoConstant
{
	  public WebDriver driver;
	  public String url=Utility.getPropertyValue(CONFIG_PATH,"URL");
	  public long duration=Long.parseLong(Utility.getPropertyValue(CONFIG_PATH,"ITO"));
	  static {
		  System.setProperty(CHROME_KEY,CHROME_VALUE);
		  System.setProperty(FIREFOX_KEY,FIREFOX_VALUE);
	  }
      @Parameters({"ip","browser"})
      @BeforeMethod
      public void openApplication(@Optional("localhost")String ip,@Optional("chrome")String browser) {
    	  driver=Utility.openBrowser(driver,ip,browser);
    	  driver.manage().timeouts().implicitlyWait(duration,TimeUnit.SECONDS);
    	  driver.get(url);
      }
      @AfterMethod
      public void closeApplication(ITestResult result) {
    	  String name = result.getName();
    	  int status=result.getStatus();
    	  if(status==2){
    		  String path = Utility.getPhoto(driver,PHOTO_PATH);
    		  Reporter.log("Test:"+name+" is Failed and photo is:"+path,true);
    	  }
    	  else {
    		  Reporter.log("Test:"+name+" is passed and no photo",true); 
    	  }
    	  driver.quit();
      }
}
