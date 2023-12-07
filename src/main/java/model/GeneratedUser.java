package model;

import net.datafaker.Faker;

import java.util.Random;

public class GeneratedUser {

    private Faker faker = new Faker();
    private Random random = new Random();
    private String title = faker.gender().binaryTypes();
    private String name = faker.name().name();
    private String email = faker.internet().emailAddress();
    private String password = faker.internet().password();
    private int dayOfBirth = faker.number().numberBetween(1, 30);
    private int monthOfBirth = faker.number().numberBetween(1, 12);
    private int yearOfBirth = faker.number().numberBetween(1980, 2000);
    private boolean signupForOurNewsLetter;
    private boolean receiveSpecialOffers;
    private String firstName = faker.name().firstName();
    private String lastName = faker.name().lastName();
    private String company = faker.company().name();
    private String address = faker.address().fullAddress();
    private String address2 = faker.address().secondaryAddress();
    private String[] allPossibleCountries = {"India", "United States", "Canada", "Australia", "Israel", "New Zealand",
            "Singapore"};
    private int countryIndex = random.nextInt(6);
    private String state = faker.address().state();
    private String city = faker.address().city();
    private String zipCode = faker.address().zipCode();
    private String mobileNumber = faker.phoneNumber().phoneNumber();

    public GeneratedUser(boolean signupForOurNewsLetter, boolean receiveSpecialOffers) {
        this.signupForOurNewsLetter = signupForOurNewsLetter;
        this.receiveSpecialOffers = receiveSpecialOffers;

    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCountry() {
        return allPossibleCountries[countryIndex];
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public boolean getSignupForOurNewsLetter() {
        return signupForOurNewsLetter;
    }

    public boolean getReceiveSpecialOffers() {
        return receiveSpecialOffers;
    }
}

