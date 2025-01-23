package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String url = "https://www.daraz.com.bd/";

    public String title = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";

    public By login_btn = By.xpath("//a[normalize-space()='Login']");

    public By signup_btn=By.xpath("//a[normalize-space()='Sign Up']");

    public void loadHomePage(){
        loadAWebPage(url);
    }


}