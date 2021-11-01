import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MethodsDemo2 {
	
	
	//1. Customer navigation
	public void navigation() {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.demoblaze.com/index.html");
			
		driver.findElement(By.className("carousel-control-prev")).click();
		driver.findElement(By.className("carousel-control-prev")).click();
		driver.findElement(By.className("carousel-control-prev")).click();
		driver.findElement(By.className("carousel-control-next-icon")).click();
		driver.findElement(By.className("carousel-control-next-icon")).click();
	
	}
	
	//2.Navigate to "Phones" and select Samsung galaxy s6
	public void selectPhone() {

	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.demoblaze.com/prod.html?idp_=1");
	}
	
	
	//3. Add to cart
	public void AddToCart() {

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.demoblaze.com/prod.html?idp_=1#");

		driver.findElement(By.name("Add to cart")).click();
		driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.className("btn-success btn-lg")).click();
		driver.findElement(By.className("btn-success")).click();
		driver.findElement(By.className("col-sm-12 col-md-6 col-lg-6")).click();
		driver.findElement(By.xpath("addToCart(1)")).click();
		driver.findElement(By.id("4479d83d-18b6-3143-eacc-9c96bf0bb4df")).click();
		}

}
