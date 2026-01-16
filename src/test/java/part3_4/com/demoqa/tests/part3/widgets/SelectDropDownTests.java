package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTests extends BaseTest {
    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandartMulti("Volvo");
        selectMenuPage.selectStandartMulti(1);
        selectMenuPage.selectStandartMulti("Audi");
        selectMenuPage.selectStandartMulti(2);

        selectMenuPage.deselectStandartMulti("saab");

        List<String> actualSelectedOptions =
                selectMenuPage.getAllSelectedStandartMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"),
                "\n Saab Is Selected As An Option \n");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));

    }
}
