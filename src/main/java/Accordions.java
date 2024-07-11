import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accordions extends Hover{
    public Accordions(WebDriver driver) {
        super(driver);
    }
    By clickMe = By.cssSelector("summary[class=\"wp-block-coblocks-accordion-item__title\"]");
    By seeText = By.cssSelector("div[class=\"wp-block-coblocks-accordion-item__content\"]");
    public void ClickAccordion(){
        WebElement seeMe = driver.findElement(clickMe);
        seeMe.click();
    }
    public void getAccordion(){
        WebElement SeeMore = driver.findElement(seeText);
        String text2 = SeeMore.getText();
        System.out.println(text2);
        if(!text2.equals("This is an accordion item.")){
            throw new AssertionError("Text is not correct");
        }
    }
}
