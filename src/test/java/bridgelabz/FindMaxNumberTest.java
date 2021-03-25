package Bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FindMaxNumberTest {

    @Test
    public void givenNumber_FirstNumberIsMax_ReturnSame() {
        FindMaxNumber<Integer> integerFindMaxNumbers = new FindMaxNumber<Integer>();
        Integer result = integerFindMaxNumbers.Maxtest(34, 32, 23);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void Number_ThirdNumberIsMax_ReturnSame() {
        FindMaxNumber<Integer> integerFindMaxNumbers = new FindMaxNumber<Integer>();
        Integer result = integerFindMaxNumbers.Maxtest(32, 33, 34);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void givenNumber_SecondNumberIsMax_ReturnSame() {
        FindMaxNumber<Integer> integerFindMaxNumbers = new FindMaxNumber<Integer>();
        Integer result = integerFindMaxNumbers.Maxtest(33, 34, 32);
        Assertions.assertEquals(34, result);
    }

    @Test
    public void Float_FirstNumberIsMax_ReturnSame() {
        FindMaxNumber<Float> floatFindMaxNumbers = new FindMaxNumber<Float>();
        Float result = floatFindMaxNumbers.Maxtest(35.2f, 33.2f, 32.2f);
        Assertions.assertEquals(35.2f, result);
    }

    @Test
    public void Float_ThirdNumberIsMax_ReturnSame() {
        FindMaxNumber<Float> floatFindMaxNumbers = new FindMaxNumber<Float>();
        Float result = floatFindMaxNumbers.Maxtest(32.2f, 33.2f, 35.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void Float_SecondNumberIsMax_ReturnSame() {
        FindMaxNumber<Float> integerFindMaxNumbers = new FindMaxNumber<Float>();
        Float result = integerFindMaxNumbers.Maxtest(33.2f, 35.2f, 32.2f);
        Assertions.assertEquals(35.2f, result);
    }

    @Test
    public void String_FirstStringIsMax_ReturnSame() {
        FindMaxNumber<String> stringFindMaxNumbers = new FindMaxNumber<String>();
        String result = stringFindMaxNumbers.Maxtest("PineApple", "Mango", "Grapes");
        Assertions.assertEquals("Grapes", result);
    }

    @Test
    public void String_SecondStringIsMax_ReturnSame() {
        FindMaxNumber<String> stringFindMaxNumbers = new FindMaxNumber<String>();
        String result = stringFindMaxNumbers.Maxtest("Mango", "PineApple", "Grapes");
        Assertions.assertEquals("Grapes", result);
    }

    @Test
    public void String_ThirdStringIsMax_ReturnSame() {
        FindMaxNumber<String> stringFindMaxNumbers = new FindMaxNumber<String>();
        String result = stringFindMaxNumbers.Maxtest("Grapes", "Mango", "PineApple");
        Assertions.assertEquals("Grapes", result);
    }

}