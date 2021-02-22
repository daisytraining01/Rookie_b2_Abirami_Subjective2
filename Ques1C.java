package subTest2;


	//import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.concurrent.TimeUnit;
	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	public class Ques1C {
	   public static void main(String[] args) throws IOException, InterruptedException {
	   
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
	      // capture screenshot and store the image
	      File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(s, new File("E:\\sel\\amazon.png"));
	      driver.quit();
	   }
	}

