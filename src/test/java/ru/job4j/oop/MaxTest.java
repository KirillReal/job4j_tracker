package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void max2() {
        int result = Max.max2(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void max3() {
        int result = Max.max3(3, 5, 7);
        assertThat(result, is(7));
    }

    @Test
    public void max4() {
        int result = Max.max4(5, 41, 412, 53);
        assertThat(result, is(412));
    }
}