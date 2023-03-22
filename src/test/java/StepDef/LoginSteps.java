package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pageObject.LoginPage;

public class LoginSteps {
    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver=Hooks.webDriver ;
    }

    @When("^user click username field$")
    public void userClickUsernameField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickUsername();
        Thread.sleep(2000);
    }

    @And("^user input username \"([^\"]*)\"$")
    public void userInputUsername(String username) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(username);
    }

    @And("^user click password field$")
    public void userClickPasswordField() {
        LoginPage loginPage = new LoginPage(webDriver) ;
        loginPage.clickPassword();
    }

    @And("^user input password \"([^\"]*)\"$")
    public void userInpurPassword(String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver) ;
        loginPage.setPassword(password);
        Thread.sleep(2000);
    }

    @And("^user click button login$")
    public void userClickButtonLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver) ;
        loginPage.clickLogin();
        Thread.sleep(3000);
    }





    @Then("^user succes login with menu \"([^\"]*)\"$")
    public void userSuccesLoginWithMenu(String dash) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(dash , loginPage.getDashboard());
        Thread.sleep(2000);
    }

    @Given("^user on the orange HRM Login$")
    public void userOnTheOrangeHRMLogin() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.getLoginPage() ;
    }

    @Then("^get notification \"([^\"]*)\"$")
    public void getNotification(String notif) {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(notif , loginPage.getInvalidNotif());
    }

    @Then("^field username get notif \"([^\"]*)\"$")
    public void fieldUsernameGetNotif(String notifUser) {
        LoginPage loginPage = new LoginPage(webDriver) ;
        Assert.assertEquals(notifUser , loginPage.getNotifUsername());
    }

    @Then("^field password get notif \"([^\"]*)\"$")
    public void fieldPasswordGetNotif(String notifPass) {
        LoginPage loginPage = new LoginPage(webDriver) ;
        Assert.assertEquals(notifPass , loginPage.getNotifPass());
    }
}
