package testcases;

import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 2)
    void setup(){
        System.out.println("I'm inside setup");
    }

    @Test(priority = 1)
    void testSteps(){
        System.out.println("I'm inside testSteps");
    }

    @Test(priority = 3)
    void teatDown(){
        System.out.println("I'm inside tearDown");
    }
}
