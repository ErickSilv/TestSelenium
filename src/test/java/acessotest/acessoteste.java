package acessotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import acesso.AcessarPagina;
import acesso.AcessarVideo;

public class acessoteste {
		
		static WebDriver driver;
		static AcessarPagina acessarpagina;
		
		static AcessarVideo acessarvideo;
		
		

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			acessarpagina = new AcessarPagina(driver);
			driver.manage().window().maximize();
			
			
			
			
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			
			boolean i = driver.getPageSource().contains("Rubens Leme");
			acessarvideo = new AcessarVideo(driver);
			
			acessarvideo.AcessarVideo();
			
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void test() {
			
			acessarpagina.AcessarPagina();
			
			
		}

	}
