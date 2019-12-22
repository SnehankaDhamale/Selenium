package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\CDAC\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://www.phptravels.net/admin");
		chrome.findElementByName("email").sendKeys("admin@phptravels.com");
		chrome.findElementByName("password").sendKeys("demoadmin");
		chrome.findElementByClassName("resultlogin").submit();
		Thread.sleep(1000);
		
		
	}

}
