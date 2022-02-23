package com.cucumber.stepdefinitions;

import com.cucumber.pages.BasePage;
import com.cucumber.pages.InformationPage;
import com.cucumber.utilities.BrowserUtils;
import com.cucumber.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddTag extends BasePage {


    @When("the user should be ablte to write some tags")
    public void the_user_should_be_ablte_to_write_some_tags() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element = Driver.get().findElement(By.id("tab_cont_cedit2"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).click().build().perform();



        BrowserUtils.waitFor(3);
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"adm-detail-tab adm-detail-tab-last\"]"))).click();

//   BrowserUtils.clickWithJS(new InformationPage().DetailButton);
//        new InformationPage().DetailButton.click();
//        Driver.get().findElement(By.xpath("//*[@id=\"tab_cont_cedit2\"]")).click();

//        Actions act =  new Actions(Driver.get());
//        act.moveToElement(Driver.get().findElement(By.id("tab_cont_cedit2"))).click().perform();
//       BrowserUtils.waitFor(3);
//        act.moveToElement(Driver.get().findElement(By.xpath("//*[@id=\"TAGS2088175452\"]"))).sendKeys("hello").perform();

//        WebElement scanEle =new WebDriverWait(Driver.get(), 20).until(ExpectedConditions.elementToBeClickable(By.id("\"tab_cont_cedit2\"")));
//        Actions action =new Actions(Driver.get());
//        action.moveToElement(scanEle).click().build().perform();
//
//
//        new WebDriverWait(Driver.get(), 10).until(ExpectedConditions.elementToBeClickable(By.id("\"tab_cont_cedit2\""))).click();



        //        Driver.get().findElement(By.xpath("//*[@id=\"TAGS2088175452\"]")).sendKeys("Hello World");



    }
}
