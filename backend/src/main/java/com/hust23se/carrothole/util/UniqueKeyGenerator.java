package com.hust23se.carrothole.util;

import java.util.UUID;

/**
 * auto generate database table key
 *
 * @author MYH
 * @date 2023-10-06
 */
public class UniqueKeyGenerator {
    public static String generateUniqueKey() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "").substring(0, 16);
    }

    public static void main(String[] args){
        System.out.println(UniqueKeyGenerator.generateUniqueKey());
    }
}