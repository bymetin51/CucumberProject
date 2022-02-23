package com.cucumber.stepdefinitions;

import com.cucumber.pages.BasePage;
import com.cucumber.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddPictureDefinition extends BasePage {



    @When("the user click Details button")
    public void the_user_click_details_button() {
        Driver.get().findElement(By.xpath("//*[@id=\"tab_cont_cedit2\"]")).click();
    }

    @Then("User should able to add and remove a picture")
    public void user_should_able_to_add_and_remove_a_picture() {

        Driver.get().findElement(By.id("bx_file_detail_picture_block")).click();

    }
}
