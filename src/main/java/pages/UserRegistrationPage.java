package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrationPage {

    private WebDriver driver;

    //private By nameField = By.xpath("//form/input[2][@name='name']");
    private By emailField = By.xpath("//form/input[3][@name='email']");
    private By signupButton = By.xpath("//div[3]/div/form/button");
    private By nameField = By.xpath("//form/input[2][@name='name']");
    private By signupLink=By.xpath("//ul/li[4]/a");
    private By passwordInput=By.id("password");
    private By daySelector =By.name("days");
    private By monthSelector =By.name("months");
    private By yearSelector =By.name("years");
    private By countrySelector =By.name("country");
    private By firstName=By.id("first_name");
    private By lastName=By.id("last_name");
    private By company=By.id("company");
    private By address=By.id("address1");
    private By state=By.id("state");
    private By city=By.id("city");
    private By zipCode=By.id("zipcode");
    private By mobileNumber=By.id("mobile_number");
    private By createAccount=By.xpath("//*[@id='form']/div/div/div/div/form/button");
    private By userTitle=By.id("id_gender1");

    public UserRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }


    // implementation methods

    public void enterEmail(String email){
        WebElement emailInput= driver.findElement(emailField);
        emailInput.sendKeys(email);
    }
    public void enterName(String name){
        WebElement nameInput= driver.findElement(nameField);
        nameInput.sendKeys(name);
    }

    public void clickSignUpBtn(){
        WebElement signupBtn= driver.findElement(signupButton);
        signupBtn.click();
    }

    public void clickSignUpLink(){
        WebElement signupLnk= driver.findElement(signupLink);
        signupLnk.click();
    }

    public void enterPasswordInput(String password){
        WebElement passInput= driver.findElement(passwordInput);
        passInput.sendKeys(password);
    }

    public void selectDayDropdown(String days) {
        // Locate the dropdown element
        WebElement selectElementDay = driver.findElement(daySelector);
        // Create a Select object to interact with the dropdown
        Select selectDays = new Select(selectElementDay);
        selectDays.selectByValue("10");
    }

    public void selectMonthDropdown(String months) {
        // Locate the dropdown element
        WebElement selectElementMonth = driver.findElement(monthSelector);
        // Create a Select object to interact with the dropdown
        Select selectMonths = new Select(selectElementMonth);
        selectMonths.selectByValue("12");
    }
    public void selectYearDropdown(String years) {
        // Locate the dropdown element
        WebElement selectElementYear = driver.findElement(yearSelector);
        // Create a Select object to interact with the dropdown
        Select selectYears = new Select(selectElementYear);
        selectYears.selectByValue("1900");
    }
    public void selectCountryDropdown(String country) {
        // Locate the dropdown element
        WebElement selectElementCountry = driver.findElement(countrySelector);
        // Create a Select object to interact with the dropdown
        Select selectCountry = new Select(selectElementCountry);
        selectCountry.selectByValue("Australia");
    }

    public void enterFirstName(String name){
        WebElement fName= driver.findElement(firstName);
        fName.sendKeys(name);
    }
    public void enterLastName(String name){
        WebElement lName= driver.findElement(lastName);
        lName.sendKeys(name);
    }
    public void enterCompany(String companyName){
        WebElement cName= driver.findElement(company);
        cName.sendKeys(companyName);
    }
    public void enterAddress(String aName){
        WebElement addName= driver.findElement(address);
        addName.sendKeys(aName);
    }
    public void enterState(String sName){
        WebElement stateName= driver.findElement(state);
        stateName.sendKeys(sName);
    }
    public void enterCity(String cName){
        WebElement cityName= driver.findElement(city);
        cityName.sendKeys(cName);
    }
    public void enterMobileNo(String mName){
        WebElement mobName= driver.findElement(mobileNumber);
        mobName.sendKeys(mName);
    }

    public void enterZipCode(String coName){
        WebElement zipocdeName= driver.findElement(zipCode);
        zipocdeName.sendKeys(coName);
    }
    public void clickCreateAccount(){
        WebElement createAccBtn= driver.findElement(createAccount);
        createAccBtn.click();
    }
 public void getUserTitle(){
        WebElement titleBtn =driver.findElement(userTitle);
        titleBtn.click();
 }


}
