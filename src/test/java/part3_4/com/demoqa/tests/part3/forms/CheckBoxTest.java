package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickParticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicobbyCheckbox();
        formsPage.unclickReadingHobbyCheckbox();

        boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected,
                "\n Reading Checkbox Is Selected \n");
    }

}
