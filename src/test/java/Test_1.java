import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {
	
	
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("textarea[title='Search']")).sendKeys("iPhone");
		driver.findElement(By.cssSelector(text[title=search]));
		driver.findElement(By.xpath(""null""));
	}

}
