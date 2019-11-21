import java.util.Random;

public class RandomNumber {

    int max = 0;
    int min = 0;

    public int[] getRandomNumbers() {
        int[] result = new int[2];
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int num = random.nextInt(31);
//            System.out.println(num);
            sum += num;
            int min = findMin(num);
            result[0] = min;
            int max = findMax(num);
            result[1] = max;
        }
//        System.out.println(sum);
        return result;
    }

    public int findMax(int number) {
        if (number > max) {
            max = number;
        }
        return max;
    }

    public int findMin(int number) {
        if (number < min) {
            min = number;
        }
        return min;
    }
}

