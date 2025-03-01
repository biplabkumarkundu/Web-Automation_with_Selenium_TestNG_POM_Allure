package pages;


import org.openqa.selenium.*;

import java.io.ByteArrayInputStream;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    public WebElement getElement(By locator){

        return getDriver().findElement(locator);
    }
    public void getAttribute(By locator,String value){

        getElement(locator).getAttribute(value);
    }
    public void clickOnElement(By locator){

        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){

        getElement(locator).sendKeys(text);
    }

    public void loadAnWebPage(String url){

        getDriver().get(url);
    }

    public String getPageTitle(){

        return getDriver().getTitle();
    }

    public void loadAWebPage(String url){

        getDriver().get(url);
    }
    public String getLoadedPageUrl(){

        return getDriver().getCurrentUrl();
    }

    public String getLoadedPageTitle(){

        return getDriver().getTitle();
    }

    public Boolean is_element_visible(By locator){
        try {
            return getElement(locator).isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

//    public void addScreenshot(String name){
//       Allure.addAttachment(name, new ByteArrayInputStream (((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
//    }


}