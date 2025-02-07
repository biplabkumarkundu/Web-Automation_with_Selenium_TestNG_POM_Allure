package pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage{
    String accountTitle="Account";
    public By account_text = By.xpath("//title[normalize-space()='Account']");

   // public By welcome_text = By.xpath("//p[normalize-space()='Welcome to OpenCart!']");

    public By logoutButton=By.xpath("//p[normalize-space()='Logout']");
    public By myOrderButton=By.xpath("//p[normalize-space()='My Orders']");


    public void doLogout(){
        if (getElement(logoutButton).isDisplayed()){
            clickOnElement(logoutButton);
        }
    }


}