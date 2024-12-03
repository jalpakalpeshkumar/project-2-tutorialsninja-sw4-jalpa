package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.TopMenu;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenu topMenu = new TopMenu();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {



        //1.1 Mouse hover on the “Desktops” Tab and click
        topMenu.mouseHourOnDesktops();

        //call the selectMenu() method and pass the menu = “Show AllDesktops”
        topMenu.clickAndSelectMenu();

        //Verify the text ‘Desktops
        topMenu.verifyTheText();
        String expectedText = "Desktops";
        String actualText = topMenu.verifyTheText();
        Assert.assertEquals(actualText,expectedText,"Desktop is not verify");

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

        //2.1 Mouse hover on the “Laptops & Notebooks” Tab and click
        topMenu.clickLaptopsAndNotebooks();

        //2.2 call selectMenu() method and pass the menu = “Show AllLaptops & Notebooks
        topMenu.clickAndSelectMenu1();

        //Verify the text ‘Laptops & Notebooks’
        topMenu.verifyTheLaptopAndNoteBooks();
        String expectedText1 = "Laptops & Notebooks";
        String actualText1 = topMenu.verifyTheLaptopAndNoteBooks();
        Assert.assertEquals(actualText1,expectedText1,"Not navigate to Laptops and Notebooks page");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

        //3.1 Mouse hover on the “Components” Tab and click
        topMenu.mouseHourOnComponents();

        //3.2 call the selectMenu() method and pass the menu = “Show AllComponents”
        topMenu.ClickAndSelectComponents();

        //3.3 Verify the text ‘Components’
        topMenu.verifyTheTextComponents();
        String expectedText2 = "Components";
        String actualText2 = topMenu.verifyTheTextComponents();
        Assert.assertEquals(actualText2,expectedText2,"Not navigate to Laptops and Notebooks page");

    }



}