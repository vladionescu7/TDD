package com.ionescu.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockExampleTest {

    Calculator mock= Mockito.mock(Calculator.class);



    @Mock
    private Calculator mockCalculator;


    @Test
    public void whenAdd_thenReturnOk(){
        //GIVEN
       when(Mockito.when(mockCalculator.add(ArgumentMatchers.eq(1), ArgumentMatchers.eq(3)))
                .thenReturn(123));

        //WHEN
        int actual= mockCalculator.add(1, 3);

        //THEN
        assertEquals(123, actual);


        verify(mockCalculator).add(anyInt(), anyInt());
    }

}
