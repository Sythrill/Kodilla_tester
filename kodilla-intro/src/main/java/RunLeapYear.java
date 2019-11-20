public class RunLeapYear {
    public static void main(String[] args) {
        LeapYear year = new LeapYear(2017);
        Boolean a = year.isLeap();
        Boolean b = year.isLeap2();
        System.out.println(a);
        System.out.println(b);
    }
}
