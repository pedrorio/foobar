package google.com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void shouldEncodeSimple() {
        String input = "code";
        String output = "100100101010100110100010";
        assertEquals(Solution.solution(input), output);
    }

    @Test
    public void shouldEncodeCapital() {
        String input = "Braille";
        String output = "000001110000111010100000010100111000111000100010";
        assertEquals(Solution.solution(input),output);
    }

    @Test
    public void shouldEncodeSentence() {
        String input = "The quick brown fox jumps over the lazy dog";
        String output = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
        assertEquals(Solution.solution(input),output);
    }
}