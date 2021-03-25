package bridgelabz;

import Bridgelabz.FindMaxNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FindMaxNumberTest {
    FindMaxNumber FindMaxNumbers = new FindMaxNumber();

    @Test
    public void givenNumber_FirstNumberIsMax_ReturnSame() {
        Integer result = FindMaxNumbers.MaxTest(34, 32, 23);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void Number_ThirdNumberIsMax_ReturnSame() {
        Integer result = FindMaxNumbers.MaxTest(32, 33, 34);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void Number_SecondNumberIsMax_ReturnSame() {
        Integer result = FindMaxNumbers.MaxTest(33, 34, 32);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void Float_FirstNumberIsMax_ReturnSame() {
        Float result = FindMaxNumbers.MaxTest(35.2f, 33.2f, 32.2f);
        Assertions.assertEquals(35.2f, result);
    }

    @Test
    public void Float_ThirdNumberIsMax_ReturnSame() {
        Float result = FindMaxNumbers.MaxTest(32.2f, 33.2f, 35.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void Float_SecondNumberIsMax_ReturnSame() {
        Float result = FindMaxNumbers.MaxTest(33.2f, 35.2f, 32.2f);
        Assertions.assertEquals(35.2f, result);
    }

}