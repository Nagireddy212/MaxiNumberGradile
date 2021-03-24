package bridgelabz;

import Bridgelabz.FindMaxNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FindMaxNumberTest {
    FindMaxNumber FindMaxNumbers = new FindMaxNumber();

    @Test
    public void givenNumber_whenFirstNumberIsMax_ReturnSame() {
        Integer result = FindMaxNumbers.testMax(34, 32, 23);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void givenNumber_whenSecondNumberIsMax_ReturnSame() {
        Integer result = FindMaxNumbers.testMax(33, 34, 32);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void givenNumber_whenThirdNumberIsMax_ReturnSame() {
        Integer result = FindMaxNumbers.testMax(32, 33, 34);
        Assertions.assertEquals(34, result);
    }

}
