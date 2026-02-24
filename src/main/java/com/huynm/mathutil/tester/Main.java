package com.huynm.mathutil.tester;

import com.huynm.mathutil.core.MathUtility;

import static com.huynm.mathutil.core.MathUtility.getFactorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //XÀI THỬ HÀM TÍNH GIAI THỪA
        System.out.println("5! = " + MathUtility.getFactorial(5));
        System.out.println("6! = " + MathUtility.getFactorial(6));


    //        testGetFactorialGivenRightArg0RunsWell();
    //        testGetFactorialGivenRightArg1RunsWell();
    //        testGetFactorialGivenRightArg2RunsWell();
    //        //testGetFactorialGivenWrongArgMinus5ThrowException();
    //        testGetFactorialGivenWrongArg25ThrowException();
    }

    //TEST CASE #5:
    //DESC: CHECK GETF() WITH VALID BOUDARY NUMBER. E.G. n = 5
    //STEP: n = 25
    //      CALL GETF(n)
    //EXPECTED: 1 NGOAI LE XUAT HIỆN, VÌ DATA ĐẦU VÀO CÀ CHỚN, BẤT ỔN, KO TÍNH DC
    //          KO CÓ GIÁ TRỊ TRẢ VỀ: THROW NEW EXCEPTION("CÂU THÔNG BÁO")
    //                                THROW NEW IllegalArgumentException("CÂU THÔNG BÁO LỖI")
    //
    //STATUS

    public static void testGetFactorialGivenWrongArg25ThrowException() {
        System.out.println("25! Expected Exception; Actual: ");
        getFactorial(25);
    }
    // THẤY NGOẠI L KHI ĐƯA n = -5; => hàm mlem với n đó, ít nhất với -5, CODE ĐÚNG

    //TEST CASE #4:
    //DESC: CHECK GETF() WITH VALID BOUDARY NUMBER. E.G. n = 5
    //STEP: n = -5
    //      CALL GETF(n)
    //EXPECTED: 1 NGOAI LE XUAT HIỆN, VÌ DATA ĐẦU VÀO CÀ CHỚN, BẤT ỔN, KO TÍNH DC
    //          KO CÓ GIÁ TRỊ TRẢ VỀ: THROW NEW EXCEPTION("CÂU THÔNG BÁO")
    //                                THROW NEW IllegalArgumentException("CÂU THÔNG BÁO LỖI")
    //
    //STATUS

    public static void testGetFactorialGivenWrongArgMinus5ThrowException() {
        System.out.println("-5! Expected Exception; Actual: ");
        getFactorial(-5);
    }
    // THẤY NGOẠI L KHI ĐƯA n = -5; => hàm mlem với n đó, ít nhất với -5, CODE ĐÚNG
    //ĐÚNG VÌ -5 PHẢI NÉM RA NGOẠI LỆ, VÀ THỰC TẾ ĐÃ NÉM
    //         EXPECTED

    //TEST CASE #3:
    //DESC: CHECK GETF() WITH VALID BOUDARY NUMBER. E.G. n = 5
    //STEP: n = 5
    //      CALL GETF(n)
    //EXPECTED: 120 AS THE RESULT OF 5;
    //STATUS
    public static void testGetFactorialGivenRightArg2RunsWell() {
        System.out.println("5! Expected: 120; Actual: " + getFactorial(5));
    }

    //TEST CASE #2:
    //DESC: CHECK GETF() WITH VALID BOUDARY NUMBER. E.G. n = 1
    //STEP: n = 1
    //      CALL GETF(n)
    //EXPECTED: 1 AS THE RESULT OF 1;
    //STATUS
    public static void testGetFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1; //0! hi vọng là 1, còn thực tế thì
        long actual; //gọi hàm mới biết
        actual = getFactorial(n);
        System.out.println(n + "! Actual: " + actual + " Expected: " + expected);
    }

    public static void testGetFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1; //0! hi vọng là 1, còn thực tế thì
        long actual; //gọi hàm mới biết
        actual = getFactorial(n);
        System.out.println(n + "! Actual: " + actual + " Expected: " + expected);
    }

    //TEST CASE #1: (CÂU SỐ 2, SỐ 3 LÀ VIẾT TEST CASE
    //ID, TEST DESCRIPTION | DATA | STEPS | PROCEDURE | EXPECTED RESULT | RESULT (PASSED | FAILED) | TEST DATE | TEST BY
    //ID   | DESC                   | DATA  | STEPS        | EXPECTED RESULT | STATUS   | DATE      | BY
    //TC01 | VERIFY getFactorial()  | n = 0 | n = 0                          | chờ chạy | 23/1/2026 | hnm
    //       CHECK                            call getf(0) | 1 is the result | mới biết |           |
    //       TEST                                            of 0!
    //       with valid n

    //CÁCH VIẾT THEO CHIỀU DỌC DỄ ĐỌC
    // TEST ID: TC01
    // DESC: CHECK getFactorial() with a value n (boundary value). e.g. 0, 20
    // DATA: n = 0
    // STEPS (CÁC BƯỚC KIỂM THỬ - NẾU TEST CHỨC NĂNG MÀN HÌNH GIỐNG NHƯ USER GUIDE
    //      STEP 1: CLICK...
    //      STEP 2: INPUT...)
    //      prepare n = 0 (a boundary value)
    // EXPECTED RESULT:
    //      getFactorial(0) will return 1
    // STATUS: PASSED | FAILED CHỜ XONG CODE, RUN HÀM MỚI BIẾT


}