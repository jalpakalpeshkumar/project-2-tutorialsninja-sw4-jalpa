package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenu extends Utility {

    By Desktops = By.linkText("Desktops");
    By selectMenu = By.linkText("Show AllDesktops");
    By verifyText = By.xpath("//h2[normalize-space()='Desktops']");
    By LaptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    By getSelectMenu1 = By.linkText("Show AllComponents");
    By verifyLaptopAndNoteBooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By components = By.linkText("Components");
    By selectMenuComponents = By.linkText("Show AllComponents");
    By verifyTheText1 = By.xpath("//h2[contains(text(),'Components')]");

    public void mouseHourOnDesktops() {
        mouseHoverToElementAndClick(Desktops);
    }

    public void clickAndSelectMenu(){
        clickOnElement(selectMenu);
    }
    public String verifyTheText(){
        return getTextFromElement(verifyText);
    }
    public void clickLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(LaptopsAndNotebooks);
    }

    public void clickAndSelectMenu1(){
        clickOnElement(getSelectMenu1);
    }

    public String verifyTheLaptopAndNoteBooks(){
        return getTextFromElement(verifyLaptopAndNoteBooks);
    }

    public void mouseHourOnComponents(){
        mouseHoverToElementAndClick(components);
    }

    public void ClickAndSelectComponents(){
        clickOnElement(selectMenuComponents);
    }

    public String verifyTheTextComponents(){
        return getTextFromElement(verifyTheText1);
    }





}
