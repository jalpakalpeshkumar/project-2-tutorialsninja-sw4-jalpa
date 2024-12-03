package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.LaptopsAndNoteBooks;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNoteBooksTest extends BaseTest {

LaptopsAndNoteBooks laptopsAndNoteBooks=new LaptopsAndNoteBooks();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){

        //1.1 Mouse hover on the Laptops & Notebooks Tab. and click
        laptopsAndNoteBooks.mouseHourLaptopAndNoteBook();

        //1.2 Click on “Show AllLaptops & Notebooks”
        laptopsAndNoteBooks.clickOnLaptopAndNotebook();

        //1.3 Select the Sort By "Price (High > Low)
        laptopsAndNoteBooks.sortByHighToLow();

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){

        //2.1 Mouse hover on the Laptops & Notebooks Tab. and click
        laptopsAndNoteBooks.mouseHourLaptopAndNoteBook();

        //2.2 Click on “Show AllLaptops & Notebooks”
        laptopsAndNoteBooks.clickOnLaptopAndNotebook();


        //2.3 Select the Sort By "Price (High > Low)
        laptopsAndNoteBooks.sortByHighToLow();

        //2.4 Select Product “MacBook”
        laptopsAndNoteBooks.selectMacBook();

         //2.5 Verify the text “MacBook”
        laptopsAndNoteBooks.verifyTheTextMacbook();
        String expected = "MacBook";
        String actual = laptopsAndNoteBooks.verifyTheTextMacbook();
        Assert.assertEquals(expected,actual,"MacBook Product not display");

        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNoteBooks.clickOnButton();

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”

        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNoteBooks.clickOnShoppingCart();

        //2.9 Verify the text "Shopping Cart"
        laptopsAndNoteBooks.verifyTheShoppingCart();
        String expectedText = "Shopping Cart";
        String actualText = laptopsAndNoteBooks.verifyTheTextMacbook();
        Assert.assertEquals(actualText,expectedText,"Shopping Cart not found");

        //2.10 Verify the Product name "MacBook"
        laptopsAndNoteBooks.verifyTheProductNameMacbook();
        String expectedProduct = "MacBook";
        String actualProduct = laptopsAndNoteBooks.verifyTheProductNameMacbook();
        Assert.assertEquals(actualProduct,expectedProduct,"Product name not matched");

        //2.11 Change Quantity "2"
        laptopsAndNoteBooks.changeTheQty();

        //2.12 Click on “Update” Tab
        laptopsAndNoteBooks.clickOnUpdate();

        //2.14 Verify the Total £737.45
        laptopsAndNoteBooks.verifyTheTotal();
        String expectedTotal = "£737.45";
        String actualTotal = laptopsAndNoteBooks.verifyTheTotal();
        Assert.assertEquals(actualTotal,expectedTotal,"Total not matched");



    }
}
