package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tect101 {

	  WebDriver driver = null;
      System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.yahoo.com");
      
      WebElement search_box = driver.findElement(By.id("ybar-sbq"));
      search_box.sendKeys("NPRU");
      
      WebElement btn_search = driver.findElement(By.id("ybar-search"));
      btn_search.click();    
      
      driver.close();
	}

}
