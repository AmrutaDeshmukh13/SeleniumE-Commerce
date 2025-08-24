package pages;
import base.TestBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
public class Login extends TestBase{

    @FindBy(xpath = "//a[text()='Log in']")
    WebElement logInLnk;
    @FindBy(id="loginusername")
    WebElement username;
    @FindBy(id="loginpassword")
    WebElement password;
    @FindBy(xpath = "//button[text()='Log in']")
    WebElement logInBtn;
    @FindBy(xpath = "//button[text()='Close']")
    WebElement closeBtn;
    //Initializing the Page Objects:
    public Login(){
        PageFactory.initElements(driver, this);
    }

    //Actions
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }
    public ProductSelection login(String un, String pwd){
        logInLnk.click();
        username.sendKeys(un);
        password.sendKeys(pwd);
        logInBtn.click();
        return new ProductSelection();
    }
}
