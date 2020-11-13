import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test4() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form/");     //open website
        driver.findElement(By.xpath("//*[contains(text(), 'Female')]")).click(); // click female
        driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[1]/label")).click();

        WebElement stateDropDown = driver.findElement(By.xpath("//div[@id='state']/div"));   //click to 1 dropdown
        stateDropDown.click();

        WebElement selectState = driver.findElement(By.xpath("//*[text()='NCR']"));    //Choose NCR
        selectState.click();

        WebElement cityDropDown = driver.findElement(By.cssSelector("div.col-md-4:nth-child(3)"));  //Click city
        cityDropDown.click();

        WebElement selectCity = driver.findElement(By.xpath("//*[text()='Noida']"));           //Choose city
        selectCity.click();

        driver.quit();
    }
}
