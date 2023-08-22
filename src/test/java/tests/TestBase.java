package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {


        @BeforeAll
        static void beforeAll() {
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.browserSize = "1500x1000";
            Configuration.pageLoadStrategy = "eager";
            //Configuration.timeout = 10_000;
        }
    }

