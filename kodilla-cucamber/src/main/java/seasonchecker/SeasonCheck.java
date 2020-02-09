package seasonchecker;

import java.time.MonthDay;

public class SeasonCheck {

    public String checkIfSummer(MonthDay date) {
        if (date.isAfter(MonthDay.of(6, 21)) && date.isBefore(MonthDay.of(9, 24))){
            return "Yes! Its Summer!";
        }
            return "Nope";
    }

}
