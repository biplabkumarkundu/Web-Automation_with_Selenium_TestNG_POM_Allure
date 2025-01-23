package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public  By email_input_box = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");

    public  By password_input_box = By.xpath("//input[@placeholder='Please enter your password']");

    public  By login_btn = By.xpath("//div[@class='iweb-button-mask']");

    public  By error_msg = By.xpath("//div[@id='fb-root']");

    public By error_required_email=By.xpath("//div[contains(@class,'index_module_loginFromWrapper__deb6dcb9')]//div[4]");

    public By error_required_password=By.xpath("//div[contains(@class,'index_module_loginFromWrapper__deb6dcb9')]//div[4]");

    public By close_btn=By.xpath("//div[contains(@class,'iweb-dialog-container-enter')]//div[contains(@class,'lzd-member-loginsign-popup-close-button')]//div//*[name()='svg']");



    public void navigateToLoginPage(){
        HomePage homePage = new HomePage();
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.login_btn);
    }

}