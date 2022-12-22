package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for(String str : args) {
            if(str.isEmpty() || str == null)
                return false;
            if(Double.parseDouble(str) <= 0)
                return false;
        }
        return true;
    }
}