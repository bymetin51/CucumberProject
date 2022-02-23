package com.cucumber.stepdefinitions;

import com.cucumber.pages.BasePage;
import com.cucumber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddButtonDefinitions extends BasePage {



    @When("User should be able to click Save and add button")
    public void user_should_be_able_to_click_save_and_add_button() {

        WebElement element = Driver.get().findElement(By.xpath("//*[@id=\"save_and_add\"]"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).click().build().perform();
    }
}
