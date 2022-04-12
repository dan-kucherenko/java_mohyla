import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class FindTheDay {
    private final String[] MONTHS_OF_YEAR = {"січень", "лютий", "березень", "квітень", "травень", "червень", "липень",
            "серпень", "вересень", "жовтень", "листопад", "грудень"};
    private final String[] DAYS_OF_WEEK = {"Понеділок", "Вівторон", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};

    public void getTheDay(String wantedDate) {
        String[] newDate = wantedDate.split(" ");
        String day = newDate[0], month = newDate[1], year = newDate[2];
        int dayInInt = Integer.parseInt(day), yearInInt = Integer.parseInt(year);
        getNumOfDaysInMonth(month, yearInInt, dayInInt);
        int leapYrs = ((yearInInt - 1) - 1920) / 4 + 1;
        int remainder = ((yearInInt - 1920) + leapYrs + (getADayInYear(month, dayInInt, yearInInt) - 1)) % 7;
        String theDay = getTheDayOfTheWeek(remainder);
    }

    private void getNumOfDaysInMonth(String month, int year, int day) {
        int numberOfDays;
        if (Objects.equals(month, MONTHS_OF_YEAR[3]) || Objects.equals(month, MONTHS_OF_YEAR[5]) ||
                Objects.equals(month, MONTHS_OF_YEAR[8]) || Objects.equals(month, MONTHS_OF_YEAR[10]))
            numberOfDays = 30;
        else if (Objects.equals(month, MONTHS_OF_YEAR[1])) {
            if (year % 4 == 0) numberOfDays = 28;
            else numberOfDays = 29;
        } else
            numberOfDays = 31;
        if (day > numberOfDays) System.out.println("Помилка у введених даних");
    }

    private int getADayInYear(String month, int numOfDays, int year) {
        int day = numOfDays;
        if (Objects.equals(month, MONTHS_OF_YEAR[3])) return day;
        else {
            int monthIndex = Arrays.asList(MONTHS_OF_YEAR).indexOf(month);
            for (int i = 0; i < monthIndex; i++) {
                switch (monthIndex) {
                    case 3, 5, 8, 10:
                        day += 30;
                        break;
                    case 2:
                        if (year % 4 == 0) day += 29;
                        break;
                    default:
                        day += 31;
                }
            }
        }
        return day;
    }

    private String getTheDayOfTheWeek(int remainder) {
        int dayOfWeek = 4;
        for (int i = 0; i < remainder; i++) {
            if (dayOfWeek == 7) dayOfWeek = 1;
            else dayOfWeek++;
        }
        return DAYS_OF_WEEK[dayOfWeek];
    }

}
