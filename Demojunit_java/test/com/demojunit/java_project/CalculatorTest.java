package com.demojunit.java_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator tester;

    @BeforeEach
    void setUp() {
        tester = new Calculator();
    }

    // simple unit test type 1
    // pass if output was as expected
    @Test
    void testAdd() {
        assertEquals(2, tester.add(10, 5), "10 / 5 must be 2");
    }

}

// on project create new folder "test"
// file + project structure OR ctrl + shift + alt + s
// modelus > sources
// set the newly created folder "test" as tests
// OK

// create JUnit test class from class file
// set to JUnit 5
// if cannot be found in module, then fix
// just install it
// now test class has been created and JUnit 5 can be used