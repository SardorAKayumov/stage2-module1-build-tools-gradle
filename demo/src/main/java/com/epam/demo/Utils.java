package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
            if (args == null)
                return false;
            for (String str : args) {
                if (str == null)
                    return false;
                if (str.trim().isEmpty())
                    return false;
                if (Double.parseDouble(str) <= 0)
                    return false;
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return false;
    }
}