package pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage{
   // public By account_text = By.xpath("//h1[normalize-space()='Account']");

   // public By welcome_text = By.xpath("//p[normalize-space()='Welcome to OpenCart!']");

    public By logout_btn=By.xpath("//a[@id='account-popup-logout']");
    public By account_btn = By.xpath("//span[@id='myAccountTrigger']");


    public void doLogout(){
        if (getElement(account_btn).isDisplayed()){
            clickOnElement(account_btn);
        }
    }


}