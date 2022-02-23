package com.cucumber.stepdefinitions;
import com.cucumber.pages.BasePage;
import com.cucumber.pages.LoginPage;
import com.cucumber.utilities.BrowserUtils;
import com.cucumber.utilities.ConfigurationReader;
import com.cucumber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class LoginStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        Driver.get().get(ConfigurationReader.get("url"));

        BrowserUtils.waitFor(3);
        String username = com.cucumber.utilities.ConfigurationReader.get("username");
        String password = com.cucumber.utilities.ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);



    }

    @When("the user clicks {string} button")
    public void the_user_clicks_button(String company) {

        Driver.get().findElement(By.xpath("//*[@id=\"bx_left_menu_menu_about_sect\"]/a/span")).click();
        addNewsButton.click();


    }









}