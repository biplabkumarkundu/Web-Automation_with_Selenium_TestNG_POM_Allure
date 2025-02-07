package pages;

import org.openqa.selenium.By;

import static utilities.DriverSetup.getDriver;

public class LoginPage extends BasePage{

    public  By email_input_box = By.xpath("//input[@id='loginEmail']");

    public  By password_input_box = By.xpath("//input[@id='loginPassword']");

    public  By login_btn = By.xpath("//button[@type='submit'][normalize-space()='Log in']");

    public By toastMessage=By.xpath("//div[contains(text(),'wrong credentials')]");







    public void navigateToLoginPage(){
        HomePage homePage = new HomePage();
        homePage.loadHomePage();
        getDriver().navigate().refresh();
        homePage.clickOnElement(homePage.registrOrLogin_btn);
    }

}