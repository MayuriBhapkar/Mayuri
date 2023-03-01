
package Assignment10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	    boolean statusbefore=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
 	    System.out.println("status before is "+statusbefore);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Mayurishinde110526@gmail.com");
 	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mayu11@");
 	    driver.findElements(By.xpath("//input[@type='checkbox']")).get(1).click();
 	    driver.findElement(By.xpath("//input[@type='radio' and @value='Female']"));
 	    WebElement statedropdown= driver.findElement(By.xpath("//select[@name='state']"));
	    Select state=new Select(statedropdown);
	    state.selectByVisibleText("Maharashtra");
 	    boolean statusafter=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
    	System.out.println("status after is "+statusafter);
        
         try
 	    {
 	    	driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	    }catch (Exception e)
	    {
	    	System.out.println("webelement click failed-try with js");
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	    	WebElement ele1=driver.findElement(By.xpath("//input[@type='radio' and @value='Female']"));
	    	js.executeScript("arguments[0].click()", ele1);
	    	WebElement ele=driver.findElement(By.xpath("//button[text()='Sign up']"));
	    	js.executeScript("arguments[0].click()", ele);
	    	boolean statusafter1=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
	    	System.out.println("status after is "+statusafter);
	    	
	    	
	    }
 	    driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("Mayurishinde110526@gmail.com");
		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("Mayu11@");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
 	   

 	   

		

	  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
      
		
		
		
		
	}


