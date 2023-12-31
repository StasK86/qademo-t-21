package com.krigersv.tests;

import com.krigersv.pages.components.RegistrationPageObjects;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import com.krigersv.utils.TestGenerator;

public class DemoRegistrationRandomTest extends TestBase {

    RegistrationPageObjects RegistrationPageObjects = new RegistrationPageObjects();
    TestGenerator utils = new TestGenerator();

    @Test
    @Tag("remote")
    void fillFormTest() {

        RegistrationPageObjects.openPage()
                .setFirstName(utils.firstName)
                .setLastName(utils.lastName)
                .genterWrapper(utils.genderWrapper)
                .setUserEmail(utils.userEmail)
                .setUserNumber(utils.userNumber)
                .setBirthDate(utils.birthDay, utils.birthMonth, utils.birthYear)
                .setUserHobbies(utils.hobbiesWrapper)
                .setUploadPicture(utils.uploadPicture)
                .setCurrentAddress(utils.currentAddress)
                .setSubjectsInput(utils.subjectsInput)
                .choiceState(utils.state)
                .choiceCity(utils.city)
                .clickSubmit();

        RegistrationPageObjects.verifyRegistrationResultModalAppears()
                .verifyResult(utils.firstName)
                .verifyResult(utils.lastName)
                .verifyResult(utils.userEmail)
                .verifyResult(utils.genderWrapper)
                .verifyResult(utils.userNumber)
                .verifyResult(utils.birthDay + " " + utils.birthMonth + "," + utils.birthYear)
                .verifyResult(utils.subjectsInput)
                .verifyResult(utils.hobbiesWrapper)
                .verifyResult(utils.uploadPicture)
                .verifyResult(utils.currentAddress)
                .verifyResult(utils.state + " " + utils.city)
                .closeModalVerify();
    }
}