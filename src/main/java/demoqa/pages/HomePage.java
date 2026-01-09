package demoqa.pages;

import com.saucedemo.pages.BasePage;
import demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
