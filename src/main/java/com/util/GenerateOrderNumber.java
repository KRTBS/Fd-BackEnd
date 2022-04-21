package com.util;

import java.util.UUID;

public class GenerateOrderNumber {

    public static String getUUID(){
        String replaceUUID = UUID.randomUUID().toString().replace("-","");
        return replaceUUID;
    }

}
