package com.ionescu.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)

public class ParameterizedTest {

    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
                {1, 1, 2},
                {2, 4, 6},
                {1, 6, 7},
                {4, 1, 5}
        });
    }

    @Parameterized.Parameter(0)
    public int argument1;

    @Parameterized.Parameter(1)
    public int argument2;

    @Parameterized.Parameter(2)
    public int expectedArgument;


}
