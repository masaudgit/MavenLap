package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DynamicData {
	WebDriver driver;
	@Test
	public void readDynData(){
		driver = new EdgeDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("ebcaptchatext"));
		String str=ele.getText();
		System.out.println(str);
		String str1=str.substring(8, 9);
		String str2=str.substring(12,13);
		System.out.println(str1);
		System.out.println(str2);
		Integer res=Integer.valueOf(str1) + Integer.valueOf(str2);
		driver.findElement(By.id("ebcaptchainput")).sendKeys(String.valueOf(res));
		boolean chkbtn=driver.findElement(By.xpath("//*[@id=\"form\"]/input[2]")).isEnabled();
		if(chkbtn==true)
		{
			System.out.println("Calculation is correct and button is enabled...");
		}
		else
		{
			System.out.println("Calculation is incorrect and button is disabled...");
		}
		driver.quit();
	}
}
