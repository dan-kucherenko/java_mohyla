import java.util.Scanner;

public class FindTheDay {
    private final String[] MONTHS_OF_YEAR = {"січень", "лютий", "березень", "квітень", "травень", "червень", "липень",
            "серпень", "вересень", "жовтень", "листопад", "грудень"};
    private final String[] DAYS_OF_WEEK = {"Понеділок", "Вівторон", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};

    public void getTheDay(String wantedDate) {
        String[] newDate = wantedDate.split(" ");
        String day = newDate[0], month = newDate[1], year = newDate[2];
        int numberOfDays;
        int dayInInt = Integer.parseInt(day), yearInInt = Integer.parseInt(year);
        if (month.contains("квітень") || month.contains("червень") || month.contains("вересень")
                || month.contains("листопад"))
            numberOfDays = 30;
        else if (month.contains("лютий")) {
            if (yearInInt % 4 == 0) numberOfDays = 28;
            else numberOfDays = 29;
        } else
            numberOfDays = 31;
        int leapYrs = ((yearInInt - 1) - 1920) / 4 + 1;
        int remainder = ((yearInInt - 1920) + leapYrs + (dayInInt - 1)) % 7;
        int dayOfWeek = 4;
    }
}
