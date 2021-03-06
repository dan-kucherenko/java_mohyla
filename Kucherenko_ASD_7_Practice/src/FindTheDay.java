import java.util.Objects;

public class FindTheDay {
    private final String[] MONTHS_OF_YEAR = {"січня", "лютого", "березня", "квітня", "травня", "червня",
            "липня", "серпня", "вересня", "жовтня", "листопада", "грудня"};
    private final String[] DAYS_OF_WEEK = {"понеділок", "вівторок", "середа", "четвер", "п'ятниця", "субота", "неділя"};

    public String getTheDay(String wantedDate) {
        String[] newDate = wantedDate.split(" ");
        String day = newDate[0], month = newDate[1], year = newDate[2];
        int dayInInt = Integer.parseInt(day), yearInInt = Integer.parseInt(year);
        getNumOfDaysInMonth(month, yearInInt, dayInInt);
        int remainder = ((yearInInt - 1920) + getTheLeapYrs(yearInInt) + (getADayInYear(month, dayInInt, yearInInt) - 1)) % 7;
        return getTheDayOfTheWeek(remainder);
    }

    private void getNumOfDaysInMonth(String month, int year, int day) {
        int numberOfDays;
        if (Objects.equals(month, MONTHS_OF_YEAR[3]) || Objects.equals(month, MONTHS_OF_YEAR[5]) ||
                Objects.equals(month, MONTHS_OF_YEAR[8]) || Objects.equals(month, MONTHS_OF_YEAR[10]))
            numberOfDays = 30;
        else if (Objects.equals(month, MONTHS_OF_YEAR[1])) {
            if (year % 4 == 0) numberOfDays = 29;
            else numberOfDays = 28;
        } else numberOfDays = 31;
        if (day > numberOfDays) {
            System.out.println("Помилка у введених даних");
            System.exit(1);
        }
    }

    private int getADayInYear(String month, int numOfDays, int year) {
        int day = numOfDays;
        if (Objects.equals(month, MONTHS_OF_YEAR[0])) return day;
        else {
            int monthIndex = 0;
            for (int i = 0; i < MONTHS_OF_YEAR.length; i++) {
                if (month.equals(MONTHS_OF_YEAR[i])) monthIndex = i;
            }
            for (int i = 0; i < monthIndex; i++) {
                switch (i) {
                    case 3, 5, 8, 10:
                        day += 30;
                        break;
                    case 1:
                        if (year % 4 == 0) day += 29;
                        else day += 28;
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
        return DAYS_OF_WEEK[dayOfWeek - 1];
    }

    private int getTheLeapYrs(int yearInInt) {
        int leapYrs;
        if (yearInInt == 1920) leapYrs = 0;
        else leapYrs = ((yearInInt - 1) - 1920) / 4 + 1;
        return leapYrs;
    }

}
