/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minhnva.mathutil.core;

import static com.minhnva.mathutil.core.MathUtil.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilTest {
     public static Object[][] initData() {
        return new Integer [][] {
                                    {1, 1},
                                    {2, 2},
                                    {5, 120},
                                    {6, 120},
        };
    }
  
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
   
}
