package org.example.lesson4;

import org.example.hw4.MyException;
import org.example.hw4.Triangle2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FirstTest {

    @Test
    void test() throws MyException {
        Triangle2 triangle2 = new Triangle2();
        Assertions.assertEquals(16.24807680927192, triangle2.someMethod(5, 7, 10));
        Assertions.assertThrows(MyException.class, () -> triangle2.someMethod(-10, 20, 30));

    }

    @ParameterizedTest
    @CsvSource({"2,4,4,0", "20,40,40,0", "200,400,400,0"})
    void testWithCsvSourceN(int a, int b, int c, int area) throws MyException {
        Triangle2 triangle2 = new Triangle2();
        Assertions.assertEquals(area, triangle2.someMethod(a, b, c));
    }
}

