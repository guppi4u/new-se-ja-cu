package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiginPage {

    private WebDriver driver;

    //private By nameField = By.xpath("//form/input[2][@name='name']");
    private By emailField = By.xpath("//form/input[3][@name='email']");
    private By signupButton = By.xpath("//div[3]/div/form/button");
    private By nameField = By.xpath("//form/input[2][@name='name']");
    private By signupLink=By.xpath("//ul/li[4]/a");

    // Constructor
    public SiginPage(WebDriver driver) {
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
}
