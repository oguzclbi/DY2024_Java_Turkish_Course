package day00_examples;

public class JP02_NewSwitchCaseStructureHoliday {
    public static void main(String[] args) {
        int dayOfWeek = 9;
        String message = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "work full time";
            case 6 -> "work half day";
            case 7 -> "take a vacation";
            default -> "unknown day";
        };
        System.out.println(message);
    }
}
