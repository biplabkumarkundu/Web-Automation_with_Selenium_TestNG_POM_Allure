package testcases;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
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

    @AfterMethod
    public void addTestScreenshot(){
        loginPage.addScreenshot("After test");
    }

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


       // Assert.assertTrue(homePage.is_element_visible(homePage.login_btn));
       // Assert.assertTrue(accountPage.is_element_visible(accountPage.account_btn));
    // Assert.assertTrue(accountPage.is_element_visible(accountPage.account_btn));
}

}
