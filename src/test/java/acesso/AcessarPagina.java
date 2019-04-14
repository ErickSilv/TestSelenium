package acesso;


	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class AcessarPagina {
		
		static WebDriver driver;
		
		
		public AcessarPagina(WebDriver driver){
		this.driver = driver;
		}
		
		
		public void AcessarPagina(){
			
			
			WebElement buscar = driver.findElement(By.id("search"));
			buscar.sendKeys("Rubens Leme");
			
			WebElement pesquisar = driver.findElement(By.id("search-icon-legacy"));
			pesquisar.click();
			
		}
		
	
			
			
}



