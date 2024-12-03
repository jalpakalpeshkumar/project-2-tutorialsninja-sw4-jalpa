package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNoteBooks extends Utility {

    By laptopAndNoteBook = By.linkText("Laptops & Notebooks");
    By showAllLaptopAndNotebook= By.linkText("Show AllLaptops & Notebooks");
    By highToLow = By.id("input-sort");
    By macBook = By.linkText("MacBook");
    By verifyMacbook = By.xpath("//h1[contains(text(),'MacBook')]");
    By button =By.xpath("/button[@id='button-cart']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyShoppingCart = By.xpath("//div[@id='content']//h1");
    By verifyProductMacbook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By Qty = By.xpath("//input[contains(@name, 'quantity')]");
    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");



    public void mouseHourLaptopAndNoteBook(){
        mouseHoverToElementAndClick(laptopAndNoteBook);
    }
    public void clickOnLaptopAndNotebook(){
        clickOnElement(showAllLaptopAndNotebook);
    }
    public void sortByHighToLow(){
        selectByVisibleTextFromDropDown(highToLow,"Price (Low > High)");
    }
    public void selectMacBook(){
        clickOnElement(macBook);
    }
    public String verifyTheTextMacbook(){
        return getTextFromElement(verifyMacbook);
    }
    public void clickOnButton(){
        clickOnElement(button);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public String verifyTheShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }
    public String verifyTheProductNameMacbook(){
        return  getTextFromElement(verifyProductMacbook);
    }
    public void changeTheQty(){
        sendTextToElement(Qty,"2");
    }
    public void clickOnUpdate(){
        clickOnElement(update);
    }
    public String verifyTheTotal(){
        return  getTextFromElement(verifyTotal);

    }
}
