package PersonalInformation;

public class PersonalInformation {

    public static void main(String[] args) {
    // Write a progam that displays the following information,
    // each on a seperate line:
    // your name
    // your address, with city, state, and zip
    // your telephone number
    // your college major
    // Although these items should be displayed on separate output lines,
    // use only a single println statement in your program

    String name = "Cherish Browne";
    String address = "56 Walter Havill";
    String city = "Halifax";
    String province = "NS";
    String postalCode = "";
    String phone = "1-902-717-6637";
    String diploma = "Database Administration";

        System.out.println(
                name + "\n" + address + "\n" + city + "\n" +
                province + "\n" + postalCode + "\n" + phone + "\n" +
                diploma
        );
    }}