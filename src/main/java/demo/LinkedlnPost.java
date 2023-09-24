package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedlnPost {

    ChromeDriver driver;
    public LinkedlnPost()
    {
        //C:\CucumberJava\src\test\resources\drivers
       // System.setProperty("wedriver.chrome.driver", "C:\\chromedriverpath\\chromedriver-win64\\chromedriver.exe");
        
		
		//co.setBinary("C:\\Users\\Eclipse\\chrome-win64\\chrome.exe");
      WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
       // driver.get("https://www.google.co.in/");
        
      
      

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void LinkedLnpostcenario(){
        System.out.println("Start Test case: LinkedLnpostcenario");
      driver.get("https://www.linkedin.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //WebElement email = driver.findElement(By.id("session_key").sendKeys("9494732902"));
     // WebElement password = driver.findElement(By.id("session_password").sendKeys("Password"));

      WebElement signinbutton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));

      signinbutton.click();
      //Thread.sleep(3000);
      WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Home']")));

WebElement countnoofviews=driver.findElement(By.xpath("//div/span/strong)[1]"));

//(//div/span/strong)[2]
WebElement startpost= driver.findElement(By.id("ember790"));
startpost.click();

WebElement headerbutton= driver.findElement(By.xpath("//h2/button[@type='button']"));
headerbutton.click();

WebElement addmediabutton= driver.findElement(By.xpath("span/button[@aria-label='Add media']"));
addmediabutton.click();

//driver.findElement(By.xpath("span/button[@aria-label='Add media']").sendKeys("photograph.jpg");




//h2/button[@type='button']
//span/button[@aria-label='Add media']
//span[text()='Next']
//span[text()='Post']

        System.out.println("end Test case: LinkedLnpostcenario");
    }

}
