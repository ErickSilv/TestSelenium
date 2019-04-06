package test;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadores {

	//instanciando a classe webdriver
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//dizer onde esta esse executavel
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.youtube.com/");
		driver.get("https://www.receita.fazenda.gov.br/PessoaJuridica/CNPJ/cnpjreva/cnpjreva_solicitacao2.asp");
		
		//configurar o firefox
		//System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		//driver = new FirefoxDriver();
		//driver.get("https://www.globo.com/");
	}

	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Fecha apenas a aba que usou
		//driver.close();
		
		//Outra forma de fechar: fecha todo o browser inteiro
		//driver.quit();
	}

}
