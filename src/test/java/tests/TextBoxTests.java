package tests;

import com.demo.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void fillFormTest() {
        textBoxPage.openPage().removeBanner()
                .seUserName("Britney Spears")
                .setUserEmail("britneyspears@gmail.com")
                .setCurrentAddress("Las Vegas")
                .setPermanentAddress("Las Vegas")
                .submit()
                .checkResult(
                        "Britney Spears",
                        "britneyspears@gmail.com",
                        "Las Vegas",
                        "Las Vegas");
    }
}

