package com.cucumber.stepdefinitions;

import com.cucumber.pages.BasePage;
import com.cucumber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class clickButtonDefinitions  extends BasePage {


    @Given("the user should be clickable Text HTML Visual Editor buttons")
    public void the_user_should_be_clickable_text_html_visual_editor_buttons() throws InterruptedException {

        Driver.get().findElement(By.id("bxed_PREVIEW_TEXT_html")).click();

        Thread.sleep(200);

        Driver.get().findElement(By.id("bxed_PREVIEW_TEXT_editor")).click();

    }



}
