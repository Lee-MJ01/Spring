package kr.co.ch04.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class RedisServiceTest {

    @Autowired
    private RedisService redisService;

    @Test
    void setValue() {
        // given
        String key = "user1:a101:uid";
        String value = "a101";

        // when
        redisService.setValue(key, value);

        // then
        assertEquals(value, redisService.getValue(key));
    }

    @Test
    void getValue() {
    }

    @Test
    void addToListFromRight() {
    }

    @Test
    void addToListFromLeft() {
    }

    @Test
    void getFromList() {
    }

    @Test
    void getRangeFromList() {
    }

    @Test
    void addToSet() {
    }

    @Test
    void getFromSet() {
    }

    @Test
    void addToHash() {
    }

    @Test
    void getFromHash() {
    }
}