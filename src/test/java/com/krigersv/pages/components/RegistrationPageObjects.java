package com.krigersv.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPageObjects {

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultsModal resultsModal = new ResultsModal();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genterWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            subjectsInput = $("input#subjectsInput"),
            state = $("#stateCity-wrapper #state"),
            stateInput = $("#state"),
            city = $("#stateCity-wrapper #city"),
            cityInput = $("#city"),
            addFormSubmit = $("#submit"),
            closeModal = $("#closeLargeModal");

    public RegistrationPageObjects openPage() {
        open("/automation-practice-form");
        closeBanner();
        return this;
    }
    public RegistrationPageObjects closeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
    public RegistrationPageObjects setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public RegistrationPageObjects setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public RegistrationPageObjects setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public RegistrationPageObjects genterWrapper(String value) {
        genterWrapper.$(byText(value)).click();
        return this;
    }
    public RegistrationPageObjects setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }
    public RegistrationPageObjects setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        new CalendarComponent().setDate(day, month, year);
        return this;
    }
    public RegistrationPageObjects setUserHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();
        return this;
    }
    public RegistrationPageObjects setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }
    public RegistrationPageObjects setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public RegistrationPageObjects setSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }
    public RegistrationPageObjects choiceState(String value) {
        state.click();
        stateInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPageObjects choiceCity(String value) {
        city.click();
        cityInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPageObjects clickSubmit() {
        addFormSubmit.click();
        return this;
    }
    public RegistrationPageObjects verifyRegistrationResultModalAppears() {
        resultsModal.verifyModal();
        return this;
    }

    public RegistrationPageObjects verifyResult(String key) {
        resultsModal.verifyResult(key);
        return this;
    }
    public RegistrationPageObjects closeModalVerify() {
        closeModal.click();
        return this;
    }
}