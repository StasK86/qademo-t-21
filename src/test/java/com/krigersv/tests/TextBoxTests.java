package com.krigersv.tests;

import com.krigersv.pages.components.TextBoxPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    @Tag("smoke")
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

