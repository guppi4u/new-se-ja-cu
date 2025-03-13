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
import org.testng.Assert;
import pages.SiginPage;

import java.time.Duration;
import java.util.Random;

public class SigninStepDef
{
    private WebDriver driver;
    private SiginPage SiginPage;
    private String url ="https://automationexercise.com/";
    Random randomNo = new Random();
    int rand= randomNo.nextInt(999999);
    private static final Logger logger = LogManager.getLogger(SigninStepDef.class);



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
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("i launch application url")
    public void i_launch_application_url() {
        SiginPage = new SiginPage(driver);
     driver.get(url);
     logger.info("ULR Opened");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I click on signin link")
    public void i_click_on_signin_link() {
        SiginPage.clickSignUpLink();
        logger.info("SignUp link clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @When("Enter username")
    public void enter_username() {
        // Write code here that turns the phrase above into concrete actions
       SiginPage.enterName("randomUName"+rand);
        logger.info("Username entered");
    }
    @When("Enter email")
    public void enter_email() {
        // Write code here that turns the phrase above into concrete actions
        SiginPage.enterEmail("randomEmail"+rand+"@test.com");
        logger.info("Password entered");
    }
    @When("I click on signup button")
    public void i_click_on_signup_button() {
        // Write code here that turns the phrase above into concrete actions
        SiginPage.clickSignUpBtn();
        logger.info("Click singup button");
    }
    @Then("Signin page should be displayed")
    public void signin_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle= driver.getTitle();
        logger.info("Title Captured");
        String expectedTitle="Automation Exercise - Signup";
        Assert.assertEquals(actualTitle,expectedTitle,"Title is Matched");
        logger.info("Assertion done one page");
    }

}
