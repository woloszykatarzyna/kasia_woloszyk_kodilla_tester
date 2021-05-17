import java.util.Scanner;

    public class SmallestNumber {

        public static int getNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number:");
            int val = scanner.nextInt();
            return val;
        }

        public static int smallest(int a, int b, int c) {
            return Math.min(Math.min(a, b), c);
        }

        public static void main(String[] args) {
            SmallestNumberCal calculator = new SmallestNumberCal();
            System.out.println("Smallest number: " + calculator.calculate());
        }
}
