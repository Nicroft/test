package com.tdea.parcial;

public class Utils {



    public static String getTimeOfDay(int hour) {
        if (isValidHour(hour)) {
            if (hour >= 0 && hour < 6) {
                return "Night";
            } else if (hour < 12 && hour > 6) {
                return "Morning";
            } else if (hour > 12 && hour < 18) {
                return "Afternoon";
            } else {
                return "Evening";
            }
        }
        return "Invalid hour";
    }

    public static boolean isValidHour(int hour) {
        if (hour < 0 || hour > 24) {
            return false;
        }
        return true;
    }


}
