import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test3() {
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Denis");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kulbachniy");
        driver.findElement(By.xpath("//button[@id='submit']")).submit();
    }
}
