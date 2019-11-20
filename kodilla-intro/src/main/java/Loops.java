public class Loops {

    public int getArraySum(int[] myArray) {
        int result = 0;
        for (int i = 0; i < myArray.length; i++) {
            result += myArray[i];
        }
        return result;
    }
}
