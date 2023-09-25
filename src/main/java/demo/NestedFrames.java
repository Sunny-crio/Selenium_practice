package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {
    ChromeDriver driver;
    public NestedFrames()
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

    
    public  void NestedFramesTest(){
        System.out.println("Start Test case: testCase01");
       driver.get("https://the-internet.herokuapp.com/nested_frames");
       
//        Switch to parent top frame switchTo().frame("frame-top")
driver.switchTo().frame("frame-top");
// Switch to child left frame switchTo().frame("frame-left")
driver.switchTo().frame("frame-left"); 
// Print the text present in the left frame WebElement.getText

System.out.println(driver.findElement(By.xpath("//body")).getText());


// Switch back to parent frame switchTo().frame("frame-top)
driver.switchTo().parentFrame();
// Switch to child middle frame switchTo().frame("frame-middle)
driver.switchTo().frame("frame-middle");




// Print the text present in the middle frame WebElement.getText
System.out.println(driver.findElement(By.xpath("//body")).getText());

// Switch back to parent frame switchTo().frame("frame-top)
driver.switchTo().parentFrame();
// Switch to child Right frame switchTo().frame("frame-right)
driver.switchTo().frame("frame-right");
// Print the text present in the Right frame WebElement.getText
System.out.println(driver.findElement(By.xpath("//body")).getText());
// Switch back to Default frame switchTo().defaultContent()
driver.switchTo().defaultContent();
// Switch to bottom frame switchTo().frame("frame-bottom)
driver.switchTo().frame("frame-botton");
// Print the text present in Bottom frame WebElement.getText
System.out.println(driver.findElement(By.xpath("//body")).getText());


        System.out.println("end Test case: testCase02");
    }


}
