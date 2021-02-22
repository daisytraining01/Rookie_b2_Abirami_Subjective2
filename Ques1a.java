package subTest2;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Fetch the confirmation text and report in command line
		File file = new File("drivers/chromedriver_new.exe");
		String filePath = file.getAbsolutePath();
		System.out.println(filePath);
System.setProperty("webdriver.chrome.driver","C:\\Users\\support\\Desktop\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();


driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("ABIRAMI");

driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Ramesh");

driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("9809491414");
Thread.sleep(3000);		
driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abiramiramesh@gmail.com");

driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("XXXXXXXXXXXX");

driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Trichy");
Thread.sleep(3000);		
driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Tamil Nadu");

driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("6000028");

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abirami");
Thread.sleep(3000);		
driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("Abiramesh4@");

driver.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("Abiramesh4@");
Thread.sleep(3000);		


driver.findElement(By.name("submit"));
WebElement login = driver.findElement(By.name("submit"));
login.click();
Thread.sleep(3000);		

driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
Thread.sleep(3000);		
driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("ABIRAMI");
driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Abiramesh4@");
driver.findElement(By.name("submit"));
WebElement login1 = driver.findElement(By.name("submit"));
login1.click();
driver.quit();
}

		

	}


