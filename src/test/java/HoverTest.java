import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HoverTest {
    static WebDriver driver;
    @BeforeClass
    public static void setUpBeforeClass(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
    }
    @Test
    public void hoverTest(){
        driver.get("https://practice-automation.com/hover/");
        Hover hover = new Hover(driver);
        hover.hoverText();
        hover.hoverText2();
    }
}
