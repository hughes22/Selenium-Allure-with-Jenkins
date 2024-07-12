import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickEvents extends Accordions {

    public ClickEvents(WebDriver driver) {
        super(driver);
    }

    By Cat = By.cssSelector("button[onclick=\"catSound()\"]");
    By view1 = By.xpath("//h2[@id='demo']");
    By Pig = By.cssSelector("button[onclick=\"pigSound()\"]");
    By Dog = By.cssSelector("button[onclick=\"dogSound()\"]");
    By Cow = By.cssSelector("button[onclick=\"cowSound()\"]");

    public void click1() {
        WebElement element = driver.findElement(Cat);
        element.click();
    }
    public void text1() {
        WebElement element = driver.findElement(view1);
        String text = element.getText();
        System.out.println(text);
        if(!"Meow!".equals(text)){
            throw new AssertionError("Text is not correct");
        }
    }
    public void click2() {
        WebElement element = driver.findElement(Pig);
        element.click();
    }
    public void text2() {
        WebElement element = driver.findElement(view1);
        String text = element.getText();
        System.out.println(text);
        if(!"Oink!".equals(text)){
            throw new AssertionError("Text is not correct");
        }
    }
    public void click3() {
        WebElement element = driver.findElement(Dog);
        element.click();
    }
    public void text3() {
        WebElement element = driver.findElement(view1);
        String text = element.getText();
        System.out.println(text);
        if(!"Woof!".equals(text)){
            throw new AssertionError("Text is not correct");
        }
    }
}
