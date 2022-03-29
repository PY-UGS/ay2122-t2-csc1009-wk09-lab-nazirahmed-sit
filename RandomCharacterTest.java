import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RandomCharacterTest {
    RandomCharacter randomTest;

    @Before
    public void setUp() throws Exception {
        randomTest = new RandomCharacter();
    }

    @Test
    public void testGetRandomLowerCaseLetter() {
        char output = randomTest.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(output));
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char output = randomTest.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(output));
    }

    @Test
    public void testGetRandomDigitCharacter() {
        char output = randomTest.getRandomDigitCharacter();
        assertTrue(Character.isDigit(output));
    }

    @Test
    public void testGetRandomCharacter() {
        char output = randomTest.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(output));
    }

    @Test
    public void testGetPrimeNumber(){
        int output = randomTest.getPrime();
        int i=2;
        boolean flag = false;
        while (i <= output / 2) {
            // condition for nonprime number
            if (output % i == 0) {
                flag = true;
            }
            ++i;
        }

        assertTrue(!flag);
    }

}
