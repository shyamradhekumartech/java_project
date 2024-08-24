package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class TestHelloWorld {

    @Test
    @DisplayName("Returning HelloWorld String")
    void testHelloWorld() throws Exception {
        Method privateMethod = org.example.Test.class.getDeclaredMethod("helloWorld");
        privateMethod.setAccessible(true);

        org.example.Test test = new org.example.Test();

        String helloWorld = (String) privateMethod.invoke(test);

        Assertions.assertNotNull(helloWorld, "Returning String should not empty or null");
    }

}
