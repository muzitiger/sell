package com.imooc.utils;

import java.util.Random;

/**
 * @program: sell
 * @description:
 * @author: Ming.Li
 * @create: 2019-05-10 09:03
 **/
public class KeyUtils {
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }

}
