public class LeapYear {
    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public Boolean isLeap() {
        if (this.year % 4 == 0) {
            return true;
        } else if (this.year % 100 == 0) {
            return true;
        } else if (this.year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public Boolean isLeap2() {
        return ((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year % 400 == 0);
    }
}
