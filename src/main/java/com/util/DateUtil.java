package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String GETIME(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));
        return simpleDateFormat.format(new Date());
    }
}
