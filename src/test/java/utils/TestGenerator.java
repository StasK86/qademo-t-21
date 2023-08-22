package utils;


public class TestGenerator {
    RandomFaker RandomFaker = new RandomFaker();
    public String
            firstName = RandomFaker.getRandomFirstName(),
            lastName = RandomFaker.getRandomLastName(),
            userEmail = RandomFaker.getRandomUserEmail(),
            genderWrapper = RandomFaker.getRandomGender(),
            userNumber = RandomFaker.getRandomUserNumber(),
            birthDay = RandomFaker.getRandomDay(),
            birthMonth = RandomFaker.getRandomMonth(),
            birthYear = RandomFaker.getRandomYear(),
            subjectsInput = RandomFaker.getRandomSubject(),
            hobbiesWrapper = RandomFaker.getRandomHobby(),
            uploadPicture = RandomFaker.getRandomPicture(),
            currentAddress = RandomFaker.getRandomCurrentAddress(),
            state = RandomFaker.getRandomState(),
            city = RandomFaker.getRandomCity(state);

}
