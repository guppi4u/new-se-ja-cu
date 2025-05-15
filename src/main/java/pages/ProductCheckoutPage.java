package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCheckoutPage {
    private WebDriver driver;
    private By productLink = By.xpath("//div/ul/li[2]/a[contains(text(),'Products')]");
    private By addToCartButton_1 = By.xpath("//div[2]/div/a[contains(text(),'Add to cart') and @data-product-id=1]");
    private By continueShoppingButton = By.xpath("//*[@id='cartModal']/div/div/div[3]/button");
    private By cartLink = By.xpath("//div/ul/li[3]/a[contains(text(),'Cart')]");
    private By proceedToCheckoutButton = By.xpath("//div[1]/div/div/a[contains(text(),'Proceed To Checkout')]");
    private By placeorderButton=By.xpath("//div/div[7]/a[contains(text(),'Place Order')]");
    private By cardNameInput=By.xpath("//div/input[@name='name_on_card']");
    private By cardNumberInput=By.xpath("//div/input[@name='card_number']");
    private By cvcInput=By.xpath("//div/input[@name='cvc']");
    private By expMonthInput=By.xpath("//div/input[@name='expiry_month']");
    private By expYearInput=By.xpath("//div/input[@name='expiry-year']");
    private By placeOrderButton=By.xpath("//div/input[@name='expiry-year']");


    public ProductCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnProductLink() {
        WebElement prdtLink = driver.findElement(productLink);
        prdtLink.click();
    }

    public void clickOnAddToCartButton() {
        WebElement addToCartBtn = driver.findElement(addToCartButton_1);
        addToCartBtn.click();
    }

    public void clickOnContinueShoppingButton() {
        WebElement continueShoppingBtn = driver.findElement(continueShoppingButton);
        continueShoppingBtn.click();
    }

    public void clickOnCartLink() {
        WebElement cartLnk = driver.findElement(cartLink);
        cartLnk.click();
    }

    public void clickOnCheckoutButton() {
        WebElement proceedToCheckoutBtn = driver.findElement(proceedToCheckoutButton);
        proceedToCheckoutBtn.click();
    }
    public void clickOnPlaceorderButton() {
        WebElement placeorderBtn = driver.findElement(placeorderButton);
        placeorderBtn.click();
    }
    public void enterCardNumber(String number) {
        WebElement cardNumIn = driver.findElement(cardNumberInput);
        cardNumIn.sendKeys(number);
    }
    public void enterCardName(String name) {
        WebElement cardNameIn = driver.findElement(cardNameInput);
        cardNameIn.sendKeys(name);
    }
    public void enterMonth(String month) {
        WebElement monthIn = driver.findElement(expMonthInput);
        monthIn.sendKeys(month);
    }
    public void enterYear(String year) {
        WebElement yearIn = driver.findElement(expYearInput);
        yearIn.sendKeys(year);
    }
    public void enterCvc(String cvc) {
        WebElement cvcIn = driver.findElement(cvcInput);
        cvcIn.sendKeys(cvc);
    }
    public void clickPlaceOrder() {
        WebElement placeOrderBtn = driver.findElement(placeOrderButton);
        placeOrderBtn.click();
    }
}