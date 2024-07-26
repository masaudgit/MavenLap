package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandlingWebElements {

	WebDriver driver;
	@Test
	public void readDynData() throws InterruptedException{
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement radHonda=driver.findElement(By.id("hondaradio"));		
		radHonda.click();
		Thread.sleep(3000);
		boolean chkHonda=radHonda.isSelected();
		System.out.println(chkHonda);
		WebElement chkBoxBMW=driver.findElement(By.id("bmwcheck"));
		chkBoxBMW.click();
		Thread.sleep(3000);
		boolean chkBMW=chkBoxBMW.isSelected();
		System.out.println(chkBMW);
		WebElement chkBoxBenz=driver.findElement(By.id("benzcheck"));
		chkBoxBenz.click();
		Thread.sleep(3000);
		boolean chkBenz=chkBoxBenz.isSelected();
		System.out.println(chkBenz);
		driver.quit();
	}
}
