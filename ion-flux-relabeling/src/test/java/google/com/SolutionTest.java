package google.com;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.util.Arrays;


public class SolutionTest {

    @Test
    public void shouldDecodeSimple() {
        int inputDepth = 5;
        int[] inputIndexes = {19, 14, 28};
        int[] output = {21, 15, 29};

        assertArrayEquals(Solution.solution(inputDepth, inputIndexes), output);
    }

    @Test
    public void shouldDecodeComplex() {
        int inputDepth = 3;
        int[] inputIndexes = {7, 3, 5, 1};
        int[] output = {-1, 7, 6, 3};

        assertArrayEquals(Solution.solution(inputDepth, inputIndexes), output);
    }
}