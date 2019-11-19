public class LeapYear {
    int year;

    public LeapYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        LeapYear year = new LeapYear(2017);
        Boolean a = year.isLeap();
        Boolean b = year.isLeap2();
        System.out.println(a);
        System.out.println(b);
    }

    public Boolean isLeap() {
        if (this.year % 4 == 0) {
            if (this.year % 100 == 0) {
                if (this.year % 400 == 0){
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }


    public Boolean isLeap2() {
        return ((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year % 400 == 0);
    }
}
