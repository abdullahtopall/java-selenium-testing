package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavascriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetPage {
    private By standartMultiSelect = By.id("cars");

    public void selectStandartMulti(String text) {
        scrollToElementJS(standartMultiSelect);
        selectByVisibleText(standartMultiSelect, text);
    }

    public void selectStandartMulti(int index) {
        scrollToElementJS(standartMultiSelect);
        selectByIndex(standartMultiSelect, index);
    }

    public void deselectStandartMulti(String value) {
        scrollToElementJS(standartMultiSelect);
        deselectByValue(standartMultiSelect,value);
    }

    public void deselectStandartMulti(int index) {
        scrollToElementJS(standartMultiSelect);
        deselectByIndex(standartMultiSelect,index);
    }

    public List<String> getAllSelectedStandartMultiOptions() {
        return getAllSelectedOptions(standartMultiSelect);
    }

}
