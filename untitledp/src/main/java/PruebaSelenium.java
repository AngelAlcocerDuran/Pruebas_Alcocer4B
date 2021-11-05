import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaSelenium {
    public static void main(String[] args) throws InterruptedException {
        String driverChrome = "./driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverChrome);

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement btnLogIn = driver.findElement(By.id("btnLogin"));

        username.sendKeys("admin");
        Thread.sleep(2000);
        password.sendKeys("admin123");
        Thread.sleep(2000);
        btnLogIn.click();

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}
