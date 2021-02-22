
package subTest2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques2 { 
public static void main(String[] args){
System.setProperty("webdriver.gecko.driver","C:\\Users\\support\\Desktop\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.get("https://maveric-systems.com/"
+ "");
driver.manage().window().maximize();
List<WebElement> allLinks = driver.findElements(By.tagName("a"));

for(WebElement link:allLinks){
System.out.println(link.getText() + " - " + link.getAttribute("href"));
}

 driver.quit();
}
}