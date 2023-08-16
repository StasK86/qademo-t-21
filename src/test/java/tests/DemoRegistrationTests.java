package tests;


import com.demo.pages.RegistrationPageObjects;
import org.junit.jupiter.api.Test;


public class DemoRegistrationTests extends TestBase {

    RegistrationPageObjects registrationPageObjects = new RegistrationPageObjects();
    @Test
    void fillFormTest() {

        registrationPageObjects.openPage()
                .setFirstName("Britney")
                .setLastName("Spears")
                .setUserEmail("britneyspears@gmail.com")
                .setGender("Female")
                .setUserNumber("7234567890")
                .setBirthDate("02","December","1981" )
                .setSubjectsInput("Arts")
                .setUserHobbies("Music")
                .setUploadPicture("britney.jpg")
                .setCurrentAddress("Las Vegas")
                .choiceState("NCR")
                .choiceCity("Delhi")
                .clickSubmit();


        registrationPageObjects.verifyRegistrationResultModalAppears()
                .verifyResult("Britney Spears")
                .verifyResult("britneyspears@gmail.com")
                .verifyResult("Female")
                .verifyResult("7234567890")
                .verifyResult("02 December,1981")
                .verifyResult("Arts")
                .verifyResult("Music")
                .verifyResult("britney.jpg")
                .verifyResult("Las Vegas")
                .verifyResult("NCR Delhi")
                .closeModalVerify();


    }

}

