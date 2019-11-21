public class RunRandomNumbers {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        int[] n = randomNumber.getRandomNumbers();
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
