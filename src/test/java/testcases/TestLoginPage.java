package testcases;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestLoginPage extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AccountPage accountPage=new AccountPage();


    @BeforeMethod
    public void setup_class(){

        loginPage.navigateToLoginPage();
    }

//    @AfterMethod
//    public void addTestScreenshot(){
//        loginPage.addScreenshot("After test");
//    }

//    @Test
//    public void testLoginWithValidCredentials(){
//        loginPage.writeOnElement(loginPage.email_input_box, "fameloh253@chysir.com");
//        loginPage.writeOnElement(loginPage.password_input_box, "Pass&Pass!");
//        loginPage.clickOnElement(loginPage.login_btn);
//        Assert.assertTrue(homePage.is_element_visible(homePage.logout_btn));
//        Assert.assertFalse(loginPage.is_element_visible(loginPage.login_btn));
//    }


@Test
    public void testLoginWithValidCredentials(){
        loginPage.writeOnElement(loginPage.email_input_box,"01821594858");
        loginPage.writeOnElement(loginPage.password_input_box,"B!plab594858");
        loginPage.clickOnElement(loginPage.login_btn);
        loginPage.clickOnElement(loginPage.login_btn2);

       // accountPage.clickOnElement(accountPage.account_btn);
    System.out.println(loginPage.getElement(loginPage.login_btn2).getAttribute("class"));
    Assert.assertEquals(loginPage.getElement(loginPage.login_btn2).getAttribute("class"),"iweb-button-mask");

       // Assert.assertTrue(homePage.is_element_visible(homePage.login_btn));
       // Assert.assertTrue(accountPage.is_element_visible(accountPage.account_btn));
    // Assert.assertTrue(accountPage.is_element_visible(accountPage.account_btn));
}
@Test
    public void testLoginWithInvalidEmailAndPassword(){
    loginPage.writeOnElement(loginPage.email_input_box,"0182159485");
    loginPage.writeOnElement(loginPage.password_input_box,"B!plab59485");
    loginPage.clickOnElement(loginPage.login_btn);
    Assert.assertTrue(loginPage.is_element_visible(loginPage.login_btn));
    //System.out.println(loginPage.is_element_visible(loginPage.login_btn));
    Assert.assertEquals(loginPage.getElement(loginPage.toast_message).getText(),"Please enter a valid phone number.");
    //System.out.println(loginPage.getElement(loginPage.toast_message).getText());

}

}
