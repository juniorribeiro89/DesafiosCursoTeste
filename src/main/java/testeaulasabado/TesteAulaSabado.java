package testeaulasabado;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAulaSabado {
	
	
	
	@Test
	public void testeLogin() {
		String caminhoDoTest = System.getProperty("user.dir") + "/src/test/resources/drives/chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, caminhoDoTest);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.navigate().to("http://demo.guru99.com/test/login.html");
		
		driver.findElement(By.id("email")).sendKeys("Junior.rxd@live.com");
		driver.findElement(By.id("passwd")).sendKeys("09876543");
		
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		Assert.assertEquals("Successfully Logged in...", driver.findElement(By.xpath("//h3[contains(text(),'Successfully Logged in...')]")).getText());
	}
	

}
