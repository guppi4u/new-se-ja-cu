package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.xpath("//form/input[2][@name='email']");
    private By passwordField = By.xpath("//form/input[3][@name='password']");
    private By loginButton = By.xpath("//div[1]/div/form/button");
    private By signupLink=By.xpath("//ul/li[4]/a");
    private By logoutLink =By.xpath("//div[2]/div/ul/li[4]/a");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // implementation methods

    public void enterEmail(String email){
        WebElement emailInput= driver.findElement(emailField);
        emailInput.sendKeys(email);
    }
    public void enterPassword(String password){
        WebElement passwordInput= driver.findElement(passwordField);
        passwordInput.sendKeys(password);
    }

    public void clickLoginBtn(){
        WebElement loginBtn= driver.findElement(loginButton);
        loginBtn.click();
    }

    public void clickSignUpLink(){
        WebElement signupLnk= driver.findElement(signupLink);
        signupLnk.click();
    }
    public void logoutButtonExist(){

        try {
            WebElement logoutLnk = driver.findElement(logoutLink);
            System.out.println("Link exists");
        } catch (NoSuchElementException e) {
            System.out.println("Link not found!!!");
        }
    }
}
