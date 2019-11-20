public class SimpleArray {

    public static void main(String[] args) {
        String[] names = new String[] {"Alek", "Tola", "Ada", "Wiola", "Bolek"};
        String name = names[3];
        System.out.println(name);
        int numOfElements = names.length;
        System.out.println("numOfElements = " + numOfElements);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
