import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickEvents extends Accordions {

    public ClickEvents(WebDriver driver) {
        super(driver);
    }

    By Cat = By.cssSelector("button[onclick=\"catSound()\"]");
    By view1 = By.xpath("//h2[@id='demo']");
    public void click1() {
        WebElement element = driver.findElement(Cat);
        element.click();
    }
    public void text1() {
        WebElement element1 = driver.findElement(view1);
        String text = element1.getText();
        System.out.println(text);
        if(!"Meow!".equals(text)){
            throw new AssertionError("Text is not correct");
        }
    }
}
