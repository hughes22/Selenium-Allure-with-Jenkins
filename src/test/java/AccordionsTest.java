import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccordionsTest {
    static WebDriver driver;
    @BeforeClass
    public static void setUpBeforeClass() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
    }
    @Test
    public void accordionsTest() {
        driver.get("https://practice-automation.com/accordions/");
        Accordions accordions = new Accordions(driver);
        accordions.ClickAccordion();
        accordions.getAccordion();
    }
}
