package generic;

public interface IAutoConstant {
	  String CHROME_KEY="webdriver.chrome.driver";           //by default it is public static final in interface
	  String CHROME_VALUE="./driver/chromedriver.exe";
	  String FIREFOX_KEY="webdriver.gecko.driver";
	  String FIREFOX_VALUE="./driver/geckodriver.exe";
	  
	  String CONFIG_PATH="./config.properties";
	  String SUMMARY_PATH="./result/summary.xlsx";
	  
	  String INPUT_PATH="./data/input.xlsx";
	  String PHOTO_PATH="./photo";
}
