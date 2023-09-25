package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imdbratings  {
     ChromeDriver driver;
    public Imdbratings(){
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
    public  void ImdbratingsTest() throws InterruptedException {
        System.out.println("Start Test case: testCaseStart");
        driver.get("https://www.imdb.com/chart/top/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        WebElement wb = driver. findElement(By.id("sort-by-selector"));
        Select s = new Select(wb);
        
    //highest rated movie on IMDb

s.selectByVisibleText("IMDb rating");
WebElement highestratedmovie= driver.findElement(By.xpath("(//a//h3)[1]"));
System.out.println(highestratedmovie.getText());

//no of movies are included
 
WebElement noofmovies= driver.findElement(By.xpath("//span[@data-testid='chart-layout-total-items']"));
String  movieno=noofmovies.getText();

System.out.println(movieno.substring(0,3));
//Int no= Integer.parseInt(movieno);
//oldest movie on the list

Thread.sleep(3000);
s.selectByVisibleText("Release date");

WebElement oldestmovie= driver.findElement(By.xpath("(//a//h3)[250]"));
System.out.println(oldestmovie.getText());

Thread.sleep(2000);

WebElement movetotop = driver.findElement(By.xpath("//button[@aria-label='Back to top']"));
movetotop.click();
// most recent movie on the list
WebElement recentmovie= driver.findElement(By.xpath("(//a//h3)[1]"));
System.out.println(recentmovie.getText());

//movie has the most user ratings

//button[@aria-label='Back to top'].click()

s.selectByVisibleText("Number of ratings");

WebElement mostuserratings = driver.findElement(By.xpath("(//a//h3)[1]"));
System.out.println(mostuserratings.getText());
//button[@aria-label='Back to top'].click()

driver.close();





    }

}
