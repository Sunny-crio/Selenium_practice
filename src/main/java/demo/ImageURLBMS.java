package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageURLBMS {
    ChromeDriver driver;
    public ImageURLBMS(){
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
    public  void ImageURLBMSTest(){
        System.out.println("Start Test case: testCaseStart");
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    
  List<WebElement> imageurls = driver.findElements(By.xpath("//h2[text()='Recommended Movies']/../../../..//img"));
  System.out.println(imageurls.size());
  for ( WebElement urls : imageurls)
  {
    System.out.println(urls.getAttribute("src"));
  }

   List<WebElement> premiereimage = driver.findElements(By.xpath("//h2[text()='Premieres']/../../../..//img"));


   
//    int n = premiereimage.size();
//    System.out.println(premiereimage.size());
//    for ( int i=0; i < n; i++)
//    {
//     premiereimage.get(i).getText();
//    }


//driver.executeScript("arguments[0].scrollIntoView();", textelement);

WebElement moviename= driver.findElement(By.xpath("((//h2[text()='Premieres']/../../../..//h3)[2]/..//div/div)[1]"));
System.out.println(moviename.getText());

WebElement movielanguage= driver.findElement(By.xpath("((//h2[text()='Premieres']/../../../..//h3)[2]/..//div/div)[2]"));
movielanguage.getText();











    driver.close();    


    }

}



