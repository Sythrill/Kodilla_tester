public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 600, 2016);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.yearPriceComparison();

        Notebook heavyNotebook = new Notebook("3500g", 1500, 2011);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.yearPriceComparison();

        Notebook oldNotebook = new Notebook("2000g", 200, 1999);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.yearPriceComparison();

        Notebook goodNotebook = new Notebook("1500g", 3000, 2018);
        System.out.println(goodNotebook.weight + " " + goodNotebook.price);
        goodNotebook.checkPrice();
        goodNotebook.checkWeight();
        goodNotebook.yearPriceComparison();

        Notebook gamingNotebook = new Notebook("1500g", 4000, 2003);
        System.out.println(gamingNotebook.weight + " " + gamingNotebook.price);
        gamingNotebook.checkPrice();
        gamingNotebook.checkWeight();
        gamingNotebook.yearPriceComparison();

        LeapYear year = new LeapYear(2017);
        Boolean a = year.isLeap();
        Boolean b = year.isLeap2();
        System.out.println(a);
        System.out.println(b);

        int[] nums = new int[]{5, 7, 12, 3, 49, 2, 11, 4, 19};
        Loops myLoop = new Loops();
        Integer myArraySum = myLoop.getArraySum(nums);
        System.out.println(myArraySum);

    }
}
