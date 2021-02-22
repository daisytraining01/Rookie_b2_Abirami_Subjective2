package cucumberJava;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en_au.When;

public class cucumberJava {

	public static WebDriver driver=null;
   
	//@Before
    @Given("^Open the chrome and launch the application$")
    public void open_the_chrome_and_launch_the_application() throws Throwable
    {
    	 System.setProperty("webdriver.chrome.driver",
                 "C:\\Users\\training\\eclipse-workspace\\testArtifactID\\src\\main\\resources\\chromedriver.exe");
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://demo.guru99.com/v4");
       Thread.sleep(3000);
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
       driver.findElement(By.name("uid")).sendKeys("mngr310019");
       driver.findElement(By.name("password")).sendKeys("mYjYnUz");
       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileHandler.copy(scrFile, new File("E:\\screenshot1.png"));
       Thread.sleep(3000);
    }

    @Then("^Login the credential$")
    public void Reset_the_credential() throws Throwable
    {
       driver.findElement(By.name("btnLogin")).click();
       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileHandler.copy(scrFile, new File("E:\\screenshot2.png"));
       Thread.sleep(3000);
    }
    
    @Then("^Logout$")
    public void Logout() throws Throwable{
        // Express the Regexp above with the code you wish you had
    	driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
    	
       }
    
    
  /*  @After
   
    @Then("^close browser$")
    public void close_browser() {
        // Express the Regexp above with the code you wish you had
       driver.quit();
    }*/
}