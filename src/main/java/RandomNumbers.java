import java.util.Random;

public class RandomNumbers {
    private int result = 0;
    private int sum = 0;
    private int min = 30;
    private int max = 0;
    private int limit = 5000;



    public void RandomNumbers() {
        Random random = new Random();
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

    }
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static void main(String[] args) {
    RandomNumbers n = new RandomNumbers();

        System.out.println(n.getMin());
        System.out.println(n.getMax());
    }
}

