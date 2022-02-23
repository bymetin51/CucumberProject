package com.cucumber.pages;

import com.cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_about_sect\"]/a/span")
    public WebElement company;

    @FindBy(xpath="//*[@id=\"bx_intranet_toolbar\"]/a[1]/span[2]")
    public WebElement addNewsButton;




    }

