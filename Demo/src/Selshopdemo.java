import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selshopdemo  {

	
	public static void main(String[] args) {
		
		//1. Customer navigation
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.navigation();
		
		//2.Navigate to "Phones" and select Samsung galaxy s6
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.selectPhone();
		
		//3. Add to cart
		MethodsDemo2 d3 = new MethodsDemo2();
		d3.AddToCart();
		
	}
		

	
}
	
	
    