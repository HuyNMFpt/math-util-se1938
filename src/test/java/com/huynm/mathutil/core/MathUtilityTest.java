package com.huynm.mathutil.core;

import org.junit.jupiter.api.Test;

import java.sql.SQLDataException;
import java.sql.SQLException;

import static com.huynm.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

    //framework: ép phải viết code theo 1 quy tắc, cấu trúc, thì mới run
class MathUtilityTest {

    @Test
    public void testFactorialGivenWrongMinus5ThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
    }

    @Test
    public void testFactorialGivenWrong25ThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(25);});
    }

    @Test
    public void testGetFactorialGivenRightArg2RunsWell() {
        assertEquals(120, getFactorial(5));
    }

    @Test
    public void testGetFactorialGivenRightArg1RunsWell() {
        assertEquals(1, getFactorial(1));
    }

    @Test
    public void testGetFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1; //0! hi vọng là 1, còn thực tế thì
        long actual; //gọi hàm mới biết
        actual = getFactorial(n);
        assertEquals(expected, actual); //hàm so sánh này của thư viện junit jupiter
        //sẽ so sánh 2 đại lượng, nếu bằng nhau thì nén ra màu xanh, khác biệt nén màu đỏ
        //  xanh đỏ để passed failed | chuẩn thế giới  khi test, khi kiểm thử ta dùng 2 màu xanh đỏ để nói về trạng thái kiểm thử: đèn xanh thông đường, code release
        //                                 đèn đỏ code bug, dừng lại fix
        //System.out.println(n + "! Actual: " + actual + " Expected: " + expected);
    }


}