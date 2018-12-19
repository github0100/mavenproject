package whyJavalearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirup Subba\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
	    
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	    
	      
        String appUrl = "https://overview.mail.yahoo.com/";
        
        //launch the firefox browser and open the application url
         driver.get(appUrl);
        
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         //maximize the browser window
         driver.manage().window().maximize();
        
        
         //	declare and initialize the variable to store the expected title of the webpage.
         String expectedTitle = "Yahoo Mail";
        
         //fetch the title of the web page and save it into a string variable
         String actualTitle = driver.getTitle();
        
         //	compare the expected title of the page with the actual title of the page and print the result
         if (expectedTitle.equals(actualTitle))
         {
                System.out.println("Verification Successful - The correct title is displayed on the web page.");
         }
        else
         {
                System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
         }
         
         driver.findElement(By.linkText("Sign in")).click();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         //enter a valid username in the email textbox
         WebElement username = driver.findElement(By.id("login-username"));
         username.clear();
         username.sendKeys("TestSelenium@yahoo.com");
         
         driver.findElement(By.id("login-signin")).click();
         
         /*        
         //enter a valid password in the password textbox
         WebElement password = driver.findElement(By.id("login-passwd"));
         password.clear();
         password.sendKeys("password123");
        
         //click on the Sign in button
         WebElement SignInButton = driver.findElement(By.id("login-signin"));
         SignInButton.click();
        
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         //close the web browser
         driver.close();
         System.out.println("Test script executed successfully.");
*/	}

}
