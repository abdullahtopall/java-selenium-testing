package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    private By practiceForMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickParticeForm() {
        scrollToElementJS(practiceForMenuItem);
        click(practiceForMenuItem);
        return new PracticeFormPage();
    }
}
