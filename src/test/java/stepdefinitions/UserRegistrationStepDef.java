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
import pages.UserRegistrationPage;

import java.time.Duration;
import java.util.Random;

public class UserRegistrationStepDef {
    private WebDriver driver;
    private UserRegistrationPage userRegistrationPage;
    private String url ="https://automationexercise.com/login";
    Random randomNo = new Random();
    int rand= randomNo.nextInt(999999);
    private static final Logger logger = LogManager.getLogger(UserRegistrationStepDef.class);



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
       //  driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }




    @Given("As new user i launch application url")
    public void as_new_user_i_launch_application_url()
    {   userRegistrationPage = new UserRegistrationPage(driver);
        driver.get(url);
        logger.info("ULR Opened");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I enter new users username")
    public void i_enter_new_users_username() {
     userRegistrationPage.enterName("radndomName"+rand);
        logger.info("Name entered");
    }
    @When("I enter new users emailid")
    public void i_enter_new_users_emailid() {
        userRegistrationPage.enterEmail("ranemail"+rand+"@"+"test.com");
        logger.info("Email entered");
    }
    @When("I click on singup button")
    public void i_click_on_singup_button() {
       userRegistrationPage.clickSignUpBtn();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Then("user sees registration page")
    public void user_sees_registration_page() {
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        logger.info("In Registration page");
    }
    @When("I select Title button")
    public void i_select_title_button() {
       userRegistrationPage.getUserTitle();
        logger.info("Title clicked");
    }
    @When("I enter password")
    public void i_enter_password() {
      userRegistrationPage.enterPasswordInput("pass"+randomNo);
        logger.info("Password entered");
    }
    @When("I select date of birth")
    public void i_select_date_of_birth() {
        userRegistrationPage.selectDayDropdown("12");
        userRegistrationPage.selectMonthDropdown("10");
        userRegistrationPage.selectYearDropdown("1990");
        logger.info("Dob selected");
    }
    @When("I enter fristname of user")
    public void i_enter_fristname_of_user() {
       userRegistrationPage.enterFirstName("fname"+rand);
        logger.info("Firstname entered");
    }
    @When("I enter lastnamename of user")
    public void i_enter_lastnamename_of_user() {
      userRegistrationPage.enterLastName("lname"+rand);
        logger.info("Lastname entered");
    }
    @When("I enter company of user")
    public void i_enter_company_of_user() {
        userRegistrationPage.enterCompany("comp"+rand);
        logger.info("Company entered");
    }
    @When("I enter address of user")
    public void i_enter_address_of_user() {
        userRegistrationPage.enterAddress("add"+rand);
        logger.info("Address entered");
    }
    @When("I select country of user")
    public void i_select_country_of_user() {
        userRegistrationPage.selectCountryDropdown("Austria");
        logger.info("country_ entered");
    }
    @When("I enter state of user")
    public void i_enter_state_of_user() {
        userRegistrationPage.enterState("testsate");
        logger.info("state  entered");
    }
    @When("I enter city of user")
    public void i_enter_city_of_user() {
        userRegistrationPage.enterCity("testcity");
        logger.info("city entered");
    }
    @When("I enter zipcode of user")
    public void i_enter_zipcode_of_user() {
        userRegistrationPage.enterZipCode("1234567");
        logger.info("zipcode entered");
    }
    @When("I enter mobilenumber of user")
    public void i_enter_mobilenumber_of_user() {
      userRegistrationPage.enterMobileNo("0987654321");
        logger.info("mobilenumber entered");
    }
    @When("I click on createaccount button")
    public void i_click_on_createaccount_button() {
      userRegistrationPage.clickCreateAccount();
        logger.info("Create account button clicked");
    }
    @Then("new user registration success message is displayed")
    public void new_user_registration_success_message_is_displayed() {
        String creatAcc=driver.getTitle();
        System.out.println(creatAcc);;
        logger.info("Acc creation successfull");
    }

}
