package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hyperlinkscount {
  ChromeDriver driver;
    public hyperlinkscount(){
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
    public  void hyperlinkscountTest(){
        System.out.println("Start Test case: testCaseStart");
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    List<WebElement> hyperlinkssize = driver.findElements(By.tagName("a"));
      System.out.println(hyperlinkssize.size());


    driver.close();    


    }

}

