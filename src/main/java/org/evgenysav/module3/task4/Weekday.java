package org.evgenysav.module3.task4;

public enum Weekday {
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THU"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private final String abbreviation;

    Weekday(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public static String getDayInfoByNumber(int number) {
        String notWeekendPattern = "%s (%s) is not a weekend.";
        String weekendPattern = "%s (%s) is a weekend.";
        return switch (number) {
            case 1 -> String.format(notWeekendPattern, MONDAY.name(), MONDAY.abbreviation);
            case 2 -> String.format(notWeekendPattern, TUESDAY.name(), TUESDAY.abbreviation);
            case 3 -> String.format(notWeekendPattern, WEDNESDAY.name(), WEDNESDAY.abbreviation);
            case 4 -> String.format(notWeekendPattern, THURSDAY.name(), THURSDAY.abbreviation);
            case 5 -> String.format(notWeekendPattern, FRIDAY.name(), FRIDAY.abbreviation);
            case 6 -> String.format(weekendPattern, SATURDAY.name(), SATURDAY.abbreviation);
            case 7 -> String.format(weekendPattern, SUNDAY.name(), SUNDAY.abbreviation);
            default -> String.valueOf(number);
        };
    }
}
