package testcases;


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
    public void testLoginWithValidCredentials() throws InterruptedException {

        loginPage.writeOnElement(loginPage.email_input_box,"biplabkundu101@gmail.com");
        loginPage.writeOnElement(loginPage.password_input_box,"bk123456");
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertEquals(homePage.getElement(homePage.aftarLogin).getText(),"Biplab Kumar");
        homePage.clickOnElement(homePage.acount_btn);
        Assert.assertTrue(accountPage.is_element_visible(accountPage.logoutButton));
        Assert.assertTrue(accountPage.is_element_visible(accountPage.myOrderButton));
        Assert.assertEquals(accountPage.getElement(accountPage.logoutButton).getText(),"Logout");
        Assert.assertEquals(accountPage.getElement(accountPage.myOrderButton).getText(),"My Orders");
        Assert.assertFalse(homePage.is_element_visible(homePage.registrOrLogin_btn));
     //   Assert.assertEquals(homePage.getElement(homePage.registrOrLogin_btn).getText(),"Biplab Kumar");

}
@Test
public void testLoginWithInvalidEmailandPassword(){
    loginPage.writeOnElement(loginPage.email_input_box,"iplabkundu101@gmail.com");
    loginPage.writeOnElement(loginPage.password_input_box,"k123456");
    loginPage.clickOnElement(loginPage.login_btn);
    Assert.assertEquals(loginPage.getElement(loginPage.toastMessage).getText(),"wrong credentials");
    Assert.assertTrue(loginPage.is_element_visible(loginPage.login_btn));
    //System.out.println(loginPage.getElement(loginPage.toastMessage).getText());

}
    @Test
    public void testLoginWithValidEmailandInvalidPassword(){
        loginPage.writeOnElement(loginPage.email_input_box,"biplabkundu101@gmail.com");
        loginPage.writeOnElement(loginPage.password_input_box,"bk12345");
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertTrue(loginPage.is_element_visible(loginPage.login_btn));
        Assert.assertEquals(loginPage.getElement(loginPage.toastMessage).getText(),"wrong credentials");
       // Assert.assertEquals(loginPage.getElement(loginPage.toastMessage).getText(),"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
       // Assert.assertEquals(loginPage.getElement(loginPage.error_msg).getAttribute("class"),"required-red mb-5 text-center login-error-list-style validation-summary-errors");
    }

}
