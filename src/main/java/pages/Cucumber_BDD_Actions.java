package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Cucumber_BDD_Actions {
	
	public static WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	public void launchBrowser(){
		driver = new ChromeDriver();
	}
	
	public void launchURL(String URL){
    	driver.get(URL);
	}
	
	public void closeBrowser(){
    	driver.quit();
	}
    
    public void add2numbers(int num1, int num2) {
    	int sum = num1 + num2;
    	System.out.println("Sum of "+num1 +" and " +num2 +" is " +sum);
    }
    
    public void verifySumViaSoftAssert(int num1, int num2, int sum) {
    	int total = num1 + num2;
		softAssert.assertEquals(sum, total);
    }
    
    public void verifySumViaHardAssert(int num1, int num2, int sum) {
    	int total = num1 + num2;
    	Assert.assertEquals(sum, total);
    }
}