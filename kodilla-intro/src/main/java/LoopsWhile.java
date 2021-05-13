import java.util.Random;

public class LoopsWhile {
    public static void main(String[] args) {
        int r = getCountOfRandomNumber(60);
        System.out.println(r);
    }

    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
