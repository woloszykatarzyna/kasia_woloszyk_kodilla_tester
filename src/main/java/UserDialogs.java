import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter your name:");                // [3]
            String name = scanner.nextLine().trim();               // [4]
            if (name.length() >= 2) {                              // [5]
                return name;                                        // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static void getColor() {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            System.out.println("Enter the first letter of the color name: B = blue, R = red, Y = yellow, G = green");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B":
                    System.out.println("Blue");
                    x = 0;
                    break;
                case "R":
                    System.out.println("Red");
                    x = 0;
                    break;
                case "Y":
                    System.out.println("Yellow");
                    x = 0;
                    break;
                case "G":
                    System.out.println("Green");
                    x = 0;
                    break;
                default:
                    System.out.println("No color. Try again.");
            }
        }
    }
}