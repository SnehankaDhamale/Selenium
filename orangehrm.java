package exam;

import org.openqa.selenium.chrome.ChromeDriver;



public class Exam {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\CDAC\\JarFile\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		
		chrome.findElementById("txtUsername").sendKeys("Admin");
		chrome.findElementById("txtPassword").sendKeys("admin123");
		chrome.findElementById("btnLogin").click();
	chrome.findElementById("welcome").click();
		Thread.sleep(1000);
	chrome.findElementByXPath("//*[@id=welcome-menu]/ul/li[2]/a").click();
		chrome .close();


	}

}
