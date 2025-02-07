package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String url = "https://www.applegadgetsbd.com/";

    public String title = "Smartphones, Gadgets & Premium Accessories | Apple Gadgets";

    public By acount_btn = By.xpath("//p[normalize-space()='Account']");

    public By registrOrLogin_btn=By.xpath("//p[normalize-space()='Register or Login']");

    public By aftarLogin=By.xpath("//p[normalize-space()='Biplab Kumar']");

    public void loadHomePage(){

        loadAWebPage(url);


    }


}