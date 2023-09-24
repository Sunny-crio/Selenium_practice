package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAmazon {
    ChromeDriver driver;
    public SearchAmazon(){
        WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
    public  void SearchAmazonTest(){
        System.out.println("Start Test case: testCaseStart");
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchbox= driver.findElement(By.xpath("//textarea[@type='search']")) ;
        searchbox.sendKeys("Amazon");
         Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ENTER).perform();
           
 
        List<WebElement> resultin = driver.findElements(By.xpath("(//*[@href='https://www.amazon.in/'])"));
    List<WebElement> resultcom = driver.findElements(By.xpath(("(//*[contains(@href,'amazon.com')])")));

if(resultin.size() >0 || resultcom.size()>0)
{
    System.out.println("results of amazan.in and amazon.com are found" + resultin.size() + " " + resultcom.size() );
}
else{
   System.out.println("results of amazan.in are not found"  ); 
}

    driver.close();    


    }

}
