package org.example.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Example1Test {

    private Example1 example1;

    @BeforeEach
    void setUp() {
        example1 = new Example1();
    }

    @Test
    void findEvenNumUsingArray() {
        // Arrange
        int[] array = new int[] {1, 2, 3, 4, 5};

        // Act
        int[] newArray = example1.findEvenNumUsingArray(array);

        // Assert
        Assertions.assertNotNull(newArray);
    }

    @Test
    void findEvenNumUsingArray_emptyArray() {
        // Arrange
        int[] array = new int[] {};

        // Act
        int[] newArray = example1.findEvenNumUsingArray(array);

        // Assert
        Assertions.assertNotNull(newArray);
    }

    @Test
    void findEvenNumUsingArray_nullArray() {
        // Arrange
        int[] array = null;

        // Act
        int[] newArray = example1.findEvenNumUsingArray(array);

        // Assert
        Assertions.assertNotNull(newArray);
    }

}