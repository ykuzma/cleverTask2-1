package ru.clevertec;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        double number;

        try {
            number = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("Be attention");
            return false;
        }

        return  number > 0;
    }
}
