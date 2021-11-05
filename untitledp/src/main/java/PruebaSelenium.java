import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaSelenium {
    public static void main(String[] args) {
        String driverChrome = "./driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverChrome);

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();
    }
}
