package com.qa.rta.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;
    public Properties prop;
    public static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();


    public static synchronized WebDriver getDriver()
    {
        return tdriver.get();
    }



    public Properties initialize_Properties() {

        prop=new Properties();
        try
        {
            FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com.qa.rta/Config/config.properties");
            prop.load(ip);
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return prop;
    }

    public WebDriver initialize_driver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();
        tdriver.set(driver);
        return getDriver();
    }


   /* public String getScreenshot()
    {
        File src=((TakeScreenshot) getDriver()).getScreenshots(OutputType.FILE);
        String path=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
        File destination=new File(path);
        try
        {
            FileUtils.copyFile(src,destination);

        }catch (IOException e)
        {
            System.out.println("Capture Failed"+e.getMessage());
        }
        return path;
    }
    */

}
