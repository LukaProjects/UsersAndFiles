import java.util.Calendar;

public class User {
    
    private static String first_name, last_name;
    private static int birthYear;
    private int uid;

    User(String first, String last, int year , int id) {  // Default constructor
        first_name = first;
        last_name = last; 
        birthYear = year;
        uid = id;
    }

    public static String getMeAnEmail() {    // Basic email formatter
        String email = first_name + "." + last_name + "@gmail.com";
        return email;
    }

    public static void isAdult(int birth_year) {
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        if (current_year - birth_year >= 18) {
            System.out.println("This person is an adult.");

            // If this passes create a file named first_name-last_name.txt with all credentials included.
        }
        else {
            System.out.println("Not an adult.");
        }
    }

}
