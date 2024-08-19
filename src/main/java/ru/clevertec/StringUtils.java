package ru.clevertec;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        double number;

        try {
            number = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return  false;
        }

        return  number > 0;
    }
}
