import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hover {
    WebDriver driver;
    public Hover(WebDriver driver) {
        this.driver = driver;
    }
    By mouseover = By.xpath("//h3[@id='mouse_over']");
    By hoverElement = By.id("mouse_over");

    public void hoverText(){
        WebElement hoverOnText = driver.findElement(mouseover);
        Actions action = new Actions(driver);
        action.moveToElement(hoverOnText).perform();
    }
    public void hoverText2(){
        WebElement hoverOnText = driver.findElement(hoverElement);
        String text = hoverOnText.getText();
        System.out.println(text);
        if(!"You did it!".equals(text)){
            throw new AssertionError("Hover text is not correct");
        }
    }
}
