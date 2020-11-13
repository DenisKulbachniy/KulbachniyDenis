import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    @Test
    public void firstTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Title length is: " + title.length());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals("https://www.google.com/", url);
        String pageSource = driver.getPageSource();
        System.out.println("Source length is: " + pageSource.length());

        driver.quit();
    }
}
