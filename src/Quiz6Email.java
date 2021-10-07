import java.util.Scanner;

public class Quiz6Email {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your first name");
        firstName=keyboard.next();
        System.out.println("Enter your last name");
        lastName=keyboard.next();
        String email;
        char chr;
        String str1="miu";
        String str2="edu";

        System.out.println("Email "+ firstName.substring(0,1).toLowerCase()+lastName.toLowerCase()+'@'+str1+'.'+str2);
    }
}
