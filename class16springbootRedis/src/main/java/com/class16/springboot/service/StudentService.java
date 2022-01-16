package com.class16.springboot.service;

/**
 * @author: lijinhao
 * @date: 2022/01/16 11:09
 */

public interface StudentService {
    /**cc
     * 将值存放到redis
     * @param key
     * @param value
     */
    void put(String key, String value);

    String get(String key);
}
