package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class Desktops extends Utility {

    By Desktop= By.linkText("Desktops");
    By showAllDesktop = By.linkText("Show AllDesktops");
    By shortByPositionName = By.id("input-sort");
    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.xpath("//ul[@class = 'dropdown-menu']/li\"), \"£Pound Sterling");
    By selectProductHP = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verify = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By deliveryDate = By.xpath("//div[@class = 'input-group date']//button");
    By enterQty = By.name("quantity");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By verifyMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCart =By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyText = By.xpath("//div[@id='content']//h1\")).contains(\"Shopping Cart");
    By verifyProduct = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By verifyDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By verifyModel = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");



    public void mouseHourOnDesktop(){
        mouseHoverToElementAndClick(Desktop);
    }

    public void clickOnShowAllDesktop(){
        clickOnElement(showAllDesktop);
    }

    public void selectSortByPositionName(){
        selectByVisibleTextFromDropDown(shortByPositionName,"Name (Z - A)");
    }

    public void SelectCurrencyAsPoundSterling(){
        clickOnElement(currency);
        selectByContainsTextFromDropDown(poundSterling,"£Pound Sterling");

    }
    public void SelectShortByPositionNameAtoZ(){
        selectByVisibleTextFromDropDown(shortByPositionName,"Name (A - Z)");
    }
    public void selectProductHpLP3065(){
        clickOnElement(selectProductHP);
    }
    public String verifyTextHP(){
        return getTextFromElement(verify);
    }

    public void selectDeliveryDate(){
        clickOnElement(deliveryDate);
    }
    public void usingSelectClassEnterQty(){
        sendTextToElement(enterQty,"1");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String verifyTheMessage(){
       return getTextFromElement(verifyMessage);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public String verifyTheText(){
        return getTextFromElement(verifyText);
    }
    public String verifyTheProductName(){
        return  getTextFromElement(verifyProduct);
    }
    public String verifyTheDate(){
        return getTextFromElement(verifyDate);
    }
    public String verifyTheModel(){
        return getTextFromElement(verifyModel);
    }


}
