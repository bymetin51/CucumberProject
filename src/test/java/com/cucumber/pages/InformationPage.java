package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yaml.snakeyaml.events.Event;

public class InformationPage extends BasePage{

    @FindBy(id ="tab_cont_cedit2")
    public WebElement DetailButton;

    @FindBy(name= "NAME")
    public WebElement TagButton;

    @FindBy(id = "bx_file_detail_picture_block")
    public WebElement AddPicture;

    @FindBy(id = "bxed_PREVIEW_TEXT_text")
    public WebElement TextRadio;

    @FindBy(id = "bxed_PREVIEW_TEXT_html")
    public WebElement HtmlRadio;

    @FindBy(id = "bxed_PREVIEW_TEXT_editor")
    public WebElement EditorRadio;

    @FindBy(xpath = "//*[@id=\"save_and_add\"]")
    public WebElement SaveandAdd;

}
