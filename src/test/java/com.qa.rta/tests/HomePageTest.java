package com.qa.rta.tests;

import com.qa.rta.Base.BasePage;
import com.qa.rta.constants.Constants;
import com.qa.rta.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class HomePageTest{
    public BasePage basePage;
    public WebDriver driver;
    public Properties prop;
    public HomePage homePage;

    @BeforeMethod
    public void setUp()
    {
        basePage=new BasePage();
        prop=basePage.initialize_Properties();
        driver=basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        homePage=new HomePage(driver);
    }
    @Test(priority=0, description="Navigation to website scenario")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Navigate to rta website from chrome browser")
    @Story("Navigate to RTA website from chrome")
    public void verifyHomePageTitleTest()
    {
    String title=homePage.getHomePageTitle();
    System.out.println("the home page title is"+title);
    Assert.assertEquals(title,Constants.HOME_PAGE_TITLE);
    }
    @Test(priority=1, description="Click on Sub menus")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Navigate to Driver section")
    @Story("Navigate Driver and RTA section")
    public void clickSection()
    {
        homePage.secondSectionClick();

    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}