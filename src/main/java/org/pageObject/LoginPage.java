package org.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    private WebElement pageLogin ;
    public boolean getLoginPage(){
        return pageLogin.isDisplayed() ;
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement username ;
    public void clickUsername(){
        username.click();
    }
    public void setUsername(String setUsername){
        username.sendKeys(setUsername);

    }

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password ;
    public void clickPassword(){
        password.click();
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    private WebElement buttonLogin ;
    public void clickLogin(){
        buttonLogin.click();
    }

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement dashboard ;
    public String getDashboard(){
        return dashboard.getText() ;
    }

}
