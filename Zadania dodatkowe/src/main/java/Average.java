
    //2. Write a Java method to compute the average of three numbers.

    //Test Data:
    //Input the first number: 25
    //Input the second number: 45
    //Input the third number: 65

    import java.util.Scanner;

public class Average {

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
    public static void main(String[] args) {
        AverageCal calculate = new AverageCal();
        System.out.println("Average: " + calculate.average());
    }
}
