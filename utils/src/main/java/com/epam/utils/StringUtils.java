package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            if (str == null)
                return false;
            if (str.trim().isEmpty())
                return false;
            String newStr = str;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(0) != '0')
                    break;
                newStr = newStr.substring(1);
            }
            return Double.parseDouble(newStr) > 0;
        } catch(NumberFormatException e) {
            System.out.println(e);
        }
        return false;
    }
}
