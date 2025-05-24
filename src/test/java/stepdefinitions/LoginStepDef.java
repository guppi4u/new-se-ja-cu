package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.SiginPage;

import java.time.Duration;
import java.util.Random;

public class LoginStepDef {
    private WebDriver driver;
    private LoginPage loginPage;
    private String urlLogin ="https://automationexercise.com/login";
    private static final Logger logger = LogManager.getLogger(LoginStepDef.class);
    // hooks from cucumber similar to testng annotations
    @Before
    public void setUp(){

        // Set up ChromeOptions to run in headless mode
       ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920x1080");

        // Initialize the Chrome driver with the options
        driver = new ChromeDriver(options);
        //WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(9));
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }


    @Given("I launch application url")
    public void i_launch_application_url() {
        loginPage= new LoginPage(driver);
        driver.get(urlLogin);
        logger.info("ULR Opened");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
       loginPage.enterEmail("testman123@mailinator.com");
       loginPage.enterPassword("password1");
       logger.info("Username and password entered");
    }
    @When("I click login button")
    public void i_click_login_button() {

        loginPage.clickLoginBtn();
        logger.info("Login button clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Then("I should be able to login successfully")
    public void i_should_be_able_to_login_successfully() {
        logger.info("Checking for logout link");
            loginPage.logoutButtonExist();




    }

}
