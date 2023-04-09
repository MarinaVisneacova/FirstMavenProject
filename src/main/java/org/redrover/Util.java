package org.redrover;


import org.apache.commons.lang3.StringUtils;

public class Util {
    //поиск сотрудника в массиве по его имени
    public static int sum(int first, int second) {
        int sum = first + second;
        StringUtils.abbreviate("dfhsjdfhs", 5);
        return sum;

    }
    public static String abbr(String text, int lenght){
        return StringUtils.abbreviate(text, lenght);
    }
}


