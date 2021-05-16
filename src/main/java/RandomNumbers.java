import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int min = 30;
        int max = 0;
        int limit = 5000;
        while (sum < limit) {
            int temp = random.nextInt(31);

            if (temp <= min) {
                min = temp;
                //System.out.println(min);
            }
            if (temp >= max) {
                max = temp;
                //System.out.println(max);
            }

            sum = sum + temp;
            result++;
        }

        System.out.println(min);
        System.out.println(max);

    }


}

