package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibraryLoginPage {
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    public void login(String username, String password){
        emailInput.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    @FindBy(id = "user_count")
    public WebElement usersCount;

    @FindBy(id = "navbarDropdown")
    public WebElement nameHolder;

    @FindBy(xpath = "//table[@id='tbl_users']//thead//th")
   // @FindBy(xpath="//thead")
    public List<WebElement> tableHeader;



}
