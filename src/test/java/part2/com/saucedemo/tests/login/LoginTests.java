package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage() throws InterruptedException {
        Thread.sleep(4000);
        loginPage.setUsername("standart_user");
        loginPage.setPassword("xyz3400");
        var productsPage = loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
