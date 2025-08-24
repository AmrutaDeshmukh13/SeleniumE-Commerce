package testCases;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import pages.ProductSelection;
import util.TestUtil;

import java.io.IOException;

public class LoginTest extends TestBase {
  Login loginPage;
  TestUtil testUtil;
    ProductSelection productSelection;
    public LoginTest(){
        super();  //thi will call constructor of TestBase class
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new Login();
    }
    @Test(priority=1)
    public void loginTest(){
        productSelection = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @AfterMethod
    public void tearDown() throws IOException {
        testUtil.takeScreenshotAtEndOfTest();
        //   driver.quit();
    }
}
