package org.demojunit.maven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator tester;

    // run before each test
    @BeforeEach
    void setUp() {
        tester = new Calculator();
    }

    // simple unit test
    // pass if output was as expected
    @Test
    void testDiv() {
        assertEquals(2, tester.div(10, 5), "10 / 5 must be 2");
    }

}

// to use JUnit 5 in maven
// go to pom.xml
// add a dependency and at least one of the two plugins
// reload pom.xml (right click > maven > reload project)
// now JUnit 5 can be used

// create JUnit test class from class file
// set to JUnit 5
// checklist before
// add method
// OK

// note: maven 2 does not support Java 16