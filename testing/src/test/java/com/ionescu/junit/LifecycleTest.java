package com.ionescu.junit;

import org.junit.*;

public class LifecycleTest {
    //execute only once, in the starting
    @BeforeClass
    public static void beforeClass() {
        System.out.println("run before the first test method");
    }
        //execute only once, in the end
        @AfterClass
        public static void afterClass() {
            System.out.println("run after the last method");
        }

        @Before
        public void before () {
            System.out.println("run before each test");
        }
            @After
            public void after () {
                System.out.println("run after each test");
            }


    @Test
    public void testcase1(){
        System.out.println("in test case 1");
    }
    @Test
    public void testcase2(){
        System.out.println("in test case 2");
    }
    @Ignore
    @Test
    public void testcase3(){
        System.out.println("You should not see this");
    }
}
