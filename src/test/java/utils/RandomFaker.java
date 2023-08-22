package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomFaker {

    Faker faker = new Faker(new Locale("de"));

    public String getRandomFirstName() {return faker.name().firstName();}
    public String getRandomLastName() {return faker.name().lastName();}
    public String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }
    public String getRandomGender() {String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);}
    public String getRandomUserNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }
    public String getRandomDay() {
        int day = faker.number().numberBetween(1,30);
        if (day < 10) {return "0" + day;} else {return Integer.toString(day);}
    }
    public String getRandomMonth() {
        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        return faker.options().option(months);
    }
    public String getRandomYear() {
        int year = faker.number().numberBetween(1959, 2020);
        return Integer.toString(year);
    }
    public String getRandomSubject() {
        String[] subjects = { "Arts", "English", "Deutsch"};
        return faker.options().option(subjects);
    }
    public String getRandomHobby() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }
    public String getRandomPicture() {
        String[] pictures = {"Deutschland.jpg"};
        return faker.options().option(pictures);
    }
    public String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }
    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }
    public String getRandomCity(String stateValue) {
        switch (stateValue) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};
                return faker.options().option(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};
                return faker.options().option(city);}
        }
                return null;
    }
}
