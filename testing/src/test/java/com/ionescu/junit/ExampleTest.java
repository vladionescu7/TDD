package com.ionescu.junit;

import com.sda.testing.Car;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void givenCalculator_whenAdd_thenReturn8() {
        //given
        Calculator calculator = new Calculator();
        int expectedResult = 8;
        //when
        int actualResult = calculator.add(5, 3);
        //then
        assert actualResult == expectedResult;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void givenCalculator_whenSubtract_thenReturn2() {
        //given
        Calculator calculator = new Calculator();
        int expectedResult = 2;
        //when
        int actualResult = calculator.subtract(5, 3);
        //then
        assert actualResult == expectedResult;
        //assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    public void givenCalculator_when3Subtract5_thenReturnOk() {
        //given
        Calculator calculator = new Calculator();
        int expectedResult = 2;
        //when
        int actualResult = calculator.subtract(3, 5);
        //then
        assert actualResult == expectedResult;
    }
    @Test
    public void givenCalculator_whenDivide_thenReturnOk() {
        //given
        Calculator calculator = new Calculator();
        int expectedResult = 2;
        //when
        int actualResult = calculator.divide(4, 2);
        //then
        assert actualResult == expectedResult;
    }

    @Rule
    public ExpectedException expectedException= ExpectedException.none();

    @Test
    public void givenCalculator_whenDivideby0WithRule_thenThrowException() {
        //given
        Calculator calculator = new Calculator();
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        //when
        calculator.divide(4, 0);
        //then

    }

    @Test(expected = ArithmeticException.class)
    public void givenCalculator_whenDivideby0_thenThrowException() {
        //given
        Calculator calculator = new Calculator();

        //when
        calculator.divide(4, 0);
        //then

    }
    @Test
    public void whatIsClass(){
        System.out.println("object represents the class at runtime: "+ Car.class);
        System.out.println("name of the object: "+ Car.class.getName());

        Car instanceOfCar= new Car();
        System.out.println("same object returned by any instance: "+ instanceOfCar.getClass());
    }



}
