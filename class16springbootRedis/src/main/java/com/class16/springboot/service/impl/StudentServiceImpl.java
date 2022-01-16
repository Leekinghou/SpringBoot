package com.class16.springboot.service.impl;

import com.class16.springboot.model.Student;
import com.class16.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author: lijinhao
 * @date: 2022/01/16 11:11
 */

@Service
public class StudentServiceImpl implements StudentService {
    /**
     * 操作redis的模版对象，由redis提供
     */
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void put(String key, String value) {
        // opsForValue()操作string类型
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
