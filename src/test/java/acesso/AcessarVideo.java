package acesso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcessarVideo {
	
	static WebDriver driver;
	
	public AcessarVideo (WebDriver driver){
	this.driver = driver;
	}

	
	public void AcessarVideo(){
		
		
		WebElement entrar = driver.findElement(By.id("channel-title"));
		entrar.click();
		
		

}
	
}
