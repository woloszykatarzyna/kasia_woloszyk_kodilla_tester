//3. Write a Java method to display the middle character of a string. Go to the editor

//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character.

//Test Data:
//Input a string: 350

//Expected Output:
//The middle character in the string: 5


import java.util.Scanner;

public class MiddleCharacter {
    public static String getNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter at least a three-digit number:");
            String number = scanner.nextLine().trim();
            if (number.length() >= 3) {
                return number;
            }
            System.out.println("String is too short. Try again.");
        }
    }
    public static String middle(String a)
    {
        int position;
        int length;
        if (a.length() % 2 == 0)
        {
            position = a.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = a.length() / 2;
            length = 1;
        }
        return a.substring(position, position + length);
    }
    public static void main(String[] args) {
        MiddleCharacterCal number = new MiddleCharacterCal();
        System.out.println("Middle character: " + number.middleCharacter());
    }
}
