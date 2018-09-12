package DataStructures.Implements;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathFuncTest {
    private MathFunc math;

    @BeforeEach
    public void init() {
        math = new MathFunc();
    }

    @AfterEach
    public void tearDown() {
        math = null;
    }

    @Test
    void calls() {
        assertEquals(0, math.getCalls());

        math.factorial(1);
        assertEquals(1, math.getCalls());

        math.factorial(1);
        assertEquals(2, math.getCalls());
    }

    @Test
    void factorial() {
        assertEquals(1, math.factorial(0));
        assertEquals(1, math.factorial(1));
        assertTrue(math.factorial(5) == 120);
    }

//    @Test
//    public void factorialNegative() {
//        math.factorial(-1);
//    }

    @Test
    public void todo() {
        assertEquals(150, math.sum(50, 100));
    }

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(MathFuncTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored test: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());

    }


}

