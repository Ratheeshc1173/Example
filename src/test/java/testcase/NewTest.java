package testcase;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
public class NewTest {
    
	WebDriver driver;
	
     @BeforeTest
      public void launchBrowser() {
    	 
    	 
          System.out.println("launching browser..."); 
          
          System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver_win32 (6)\\chromedriver.exe"); 
          driver = new ChromeDriver(); 
          driver.navigate().to("https://www.globalsqa.com/demo-site/");                
          driver.manage().window().maximize();
        
          System.out.println("Before class executed succesfully...."); 
          
      }
      @Test(enabled = false)
      public void verifyHomepageTitle() throws InterruptedException {
    	  
    	  driver.findElement(By.linkText("Frames")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//*[@id=\"iFrame\"]")).click();
    	  Thread.sleep(3000);
    	  driver.switchTo().frame("globalSqa");
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("mobile_menu_toggler")).click();
    	  Thread.sleep(3000);
    	  
    	  
          //String expectedTitle = "Welcome: Mercury Tours";
          //String actualTitle = driver.getTitle();
          //Assert.assertEquals(actualTitle, expectedTitle);
     }
      @Test(enabled = false)
      
public void drpdwn() throws InterruptedException {
    	  
    	  driver.findElement(By.linkText("DropDown")).click();
    	  Thread.sleep(2000);
    	  Select s=new Select(driver.findElement(By.xpath("//*[@id='post-2646']//select")));
    	  s.selectByVisibleText("India");
    	  Thread.sleep(3000);
      }
      
      @Test(enabled = false)
      
      public void dragdrp() throws InterruptedException {
          	  
          	  driver.findElement(By.linkText("DragAndDrop")).click();
          	  Thread.sleep(2000);
          	  driver.findElement(By.id("Accepted Elements")).click();
          	  Thread.sleep(2000);
          	  
          	  WebElement from=driver.findElement(By.linkText("Drag me to my target"));	
          	  WebElement to=driver.findElement(By.linkText("accept: '#draggable'"));	
          	  Actions act= new Actions(driver);
          	  act.dragAndDrop(from, to).build().perform();
          	  
          	  Thread.sleep(3000);
            }  
      
      @AfterTest
      public void terminateBrowser(){
          //driver.close();
      }
}