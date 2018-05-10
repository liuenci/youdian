package com.mmall.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RandomTest {
    @Test
    public void testRandom(){
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            stringBuffer.append(random.nextInt(10));// [0,10)
            System.out.println(random.nextBoolean());
        }
        System.out.println(stringBuffer.toString());

        // 断言
        Assert.assertTrue(true);
    }
}
