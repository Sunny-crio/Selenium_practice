package demo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

    
    public  void LinkedLnpostcenario() throws Exception{
        System.out.println("Start Test case: LinkedLnpostcenario");
      driver.get("https://www.linkedin.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      WebElement email = driver.findElement(By.id("session_key"));
      email.sendKeys("sunnyhith.avadootha4@gmail.com");
     WebElement password = driver.findElement(By.id("session_password"));
     password.sendKeys("Sunny@9494");

      WebElement signinbutton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));

      signinbutton.click();
      //Thread.sleep(3000);
      WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Home']")));

WebElement countnoofviews=driver.findElement(By.xpath("(//div/span/strong)[1]"));
System.out.println("no of views"  + " " + countnoofviews.getText());

//(//div/span/strong)[2]
WebElement startpost= driver.findElement(By.xpath("(//button/span/span)[1]"));
startpost.click();

WebElement headerbutton= driver.findElement(By.xpath("//h2/button[@type='button']"));
headerbutton.click();

 driver.findElement(By.xpath("//span/span/strong[text()='Connections only']")).click();

 driver.findElement(By.xpath("//button/span[text()='Done']")).click();

//WebElement addmediabutton= driver.findElement(By.xpath("//span/button[@aria-label='Add media']"));
//addmediabutton.click();

//driver.findElement(By.xpath("span/button[@aria-label='Add media']").sendKeys("photograph.jpg");
//uploading image
//WebElement upload_file = driver.findElement(By.xpath("//input[@id='file_up']"));


//WebElement upload_file =driver.findElement(By.xpath("//span/button[@aria-label='Add media']"));
//upload_file.sendKeys("/Users/local admin/Downloads/declarationimage.jpg");






    Robot robot = new Robot();

    // Simulate pressing the "Tab" key to focus on the file input field
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);

    // Type the file path
    String filePath = "\"C:\\Users\\local admin\\Downloads\\declarationimage.jpg\""; // Replace with your file path
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    StringSelection stringSelection = new StringSelection(filePath);
    clipboard.setContents(stringSelection, null);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    // Simulate pressing the "Enter" key to confirm the file upload
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

//driver.findElement(By.xpath("//button/span[text()='Next']")).click();







//span[text()='Post']
driver.close();

        System.out.println("end Test case: LinkedLnpostcenario");
    }

}
