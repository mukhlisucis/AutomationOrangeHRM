package StepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        webDriver  = new ChromeDriver(options);
        String appUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



    }

    @After
    public void closeBrowser(){
        webDriver.quit();
    }



}
