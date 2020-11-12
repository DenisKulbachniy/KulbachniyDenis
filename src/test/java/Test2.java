import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void secondTest() {
        driver.get("https://www.google.com.ua/search?q=w3 website");
        driver.findElement(By.xpath("(//span[contains(text(),'W3Schools')])[1]")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.w3schools.com/");
        driver.navigate().refresh();

        driver.quit();

    }
}
