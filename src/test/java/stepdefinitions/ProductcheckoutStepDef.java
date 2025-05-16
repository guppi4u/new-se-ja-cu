package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.ProductCheckoutPage;

import java.time.Duration;

public class ProductcheckoutStepDef {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductCheckoutPage productCheckoutPage;
    private String urlLogin = "https://automationexercise.com/login";
    private static final Logger logger = LogManager.getLogger(LoginStepDef.class);

    // hooks from cucumber similar to testng annotations
    @Before
    public void setUp() {

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
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("^I launch application url and watch$")
    public void i_launch_application_url_and_watch() {
        loginPage = new LoginPage(driver);
        driver.get(urlLogin);
        logger.info("ULR Opened");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @When("I enter registered email address and password")
    public void i_enter_registered_email_address_and_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterEmail("testman123@mailinator.com");
        loginPage.enterPassword("password1");
        logger.info("Username and password entered");
    }

    @When("I click on login button and watch")
    public void i_click_on_login_button_and_watch() {

        loginPage.clickLoginBtn();
        logger.info("Login button clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Then("I should be able to login and see home page")
    public void i_should_be_able_to_login_and_see_home_page() {
        logger.info("Checking for logout link");
        loginPage.logoutButtonExist();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }
    @When("I click on view product link")
    public void i_click_on_view_product_link() {
        productCheckoutPage.clickOnProductLink();
        logger.info("Product link clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I click on add to cart button")
    public void i_click_on_add_to_cart_button() {
        productCheckoutPage.clickOnAddToCartButton();
        logger.info("Add to cart button clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I click on continue shopping button")
    public void i_click_on_continue_shopping_button() {
        productCheckoutPage.clickOnContinueShoppingButton();
        logger.info("Continue Shopping button clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I click on cart icon")
    public void i_click_on_cart_icon() {
        productCheckoutPage.clickOnCartLink();
        logger.info("Cart link clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I click on proceed to checkout")
    public void i_click_on_proceed_to_checkout() {
        productCheckoutPage.clickOnCheckoutButton();
        logger.info("Proceed to checkout button clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @When("I click on place order button")
    public void i_click_on_Place_order_button() {
        productCheckoutPage.clickOnPlaceorderButton();
        logger.info("Place order button clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Then("Payment page should be displayed")
    public void payment_page_should_be_displayed() {
        logger.info("Payment page is displayed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I enter name on card")
    public void i_enter_name_on_card() {
        productCheckoutPage.enterCardName("tester");
        logger.info("Card name entered");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I enter card number")
    public void i_enter_card_number() {
        productCheckoutPage.enterCardNumber("1234123412341234");
        logger.info("Card number entered");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I enter cvc and expiration")
    public void i_enter_cvc_and_expiration() {
        productCheckoutPage.enterCvc("123");
        productCheckoutPage.enterMonth("11");
        productCheckoutPage.enterYear("1990");
        logger.info("CVC details entered");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @When("I click on place order button and watch")
    public void i_click_on_place_order_button_and_watch() {
        productCheckoutPage.clickPlaceOrder();
        logger.info("Place order clicked");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    @Then("Order is placed message should be displayed")
    public void order_is_placed_message_should_be_displayed() {
        logger.info("Payment page is displayed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

}

