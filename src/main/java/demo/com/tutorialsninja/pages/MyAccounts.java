package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccounts extends Utility {

    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By registerAccount = By.xpath("//h1[contains(text(),'Register Account')]");
    By returningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By Telephone = By.id("input-telephone");
    By Password = By.id("input-password");
    By PasswordConfirm = By.id("input-confirm");
    By subscribeRadioButton = By.xpath("//fieldset[3]//input");
    By policyCheckBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By loginButton = By.xpath("//input[@value='Login']");
    By verifyMyAccount = By.xpath("//span[contains(text(),'My Account')]");
    By accountLink = By.xpath("//span[contains(text(),'My Account')");
    By accountLogOut = By.xpath("//h1[contains(text(),'Account Logout')]");


    public void AccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    public void clickOnMyAccount() {
        clickOnElement(myAccount);
    }

    public String verifyText() {
        return getTextFromElement(registerAccount);
    }

    public String verifyTheTextReturningCustomer() {
        return getTextFromElement(returningCustomer);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, "jalpa");
    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, "kalpeshkumar");
    }

    public void enterEmailId(String name) {
        sendTextToElement(email, "jalpa");
    }

    public void enterTelephoneNumber(String name) {
        sendTextToElement(Telephone, "jalpa");
    }

    public void enterPassword() {
        sendTextToElement(Password, "jalpA123@");


    }
    public void enterPasswordConfirm() {
        sendTextToElement(PasswordConfirm, "jalpA123@");

    }
    public void selectSubscribeRadioButton(){
        selectByContainsTextFromDropDown(subscribeRadioButton,"Yes");
    }
    public void clickOnPrivacyCheckBox(){
        clickOnElement(policyCheckBox);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String verifyTheTextMyAccount(){
        return getTextFromElement(verifyMyAccount);
    }
    public void clickOnMyAccountLink(){
        clickOnElement(accountLink);
    }
    public String verifyTheAccountLogOut(){
        return getTextFromElement(accountLogOut);
    }

}
