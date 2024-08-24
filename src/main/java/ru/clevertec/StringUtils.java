package ru.clevertec;

public class StringUtils {

    public boolean isPositiveNumber(String str) throws NumberFormatException{
        return Double.parseDouble(str) > 0;
    }
}
