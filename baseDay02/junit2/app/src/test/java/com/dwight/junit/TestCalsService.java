package com.dwight.junit;

/**
 * Created by dwight on 2018/3/28.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalsService {

    @Test
    public void testAdd() {
        CalcService service = new CalcService();
        int result = service.add(3, 8);

        assertEquals(12, result);
    }
}
