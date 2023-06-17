package com.qa.rta.pages;

import com.qa.rta.Base.BasePage;
import com.qa.rta.constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage
{
   // @FindBy(id="pageTitle")
   // WebElement homePageHeader;

    @FindBy(xpath="//ul/li/a[@href=\"/wps/portal/rta/ae/driver-and-carowner\"]")
    WebElement secondSection;
    @FindBy(id="pageTitle")
    WebElement homePage;


    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void secondSectionClick()  {
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(secondSection)).click();
    }

    public String getHomePageTitle()
    {
       WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.titleContains(Constants.HOME_PAGE_TITLE));
        return driver.getTitle();
    }
/*
    public boolean verifyHomePageHeader()
    {
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(homePageHeader));
        return homePageHeader.isDisplayed();
    }


    public String getHomePageHeaderText() {
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(homePageHeader));
        return homePageHeader.getText();
    }*/
}

